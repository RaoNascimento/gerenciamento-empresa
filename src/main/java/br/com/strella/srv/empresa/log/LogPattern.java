package br.com.strella.srv.empresa.log;

import ch.qos.logback.classic.spi.ILoggingEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class LogPattern extends ch.qos.logback.classic.PatternLayout {

	public void setMultilinePattern(Pattern multilinePattern) {
		this.multilinePattern = multilinePattern;
	}

	//@Setter
	private Pattern multilinePattern;

	private final List<String> maskPatterns = new ArrayList<>();

	@Override
	public void start() {
		for (final String classFieldName : SensitiveData.SENSITIVE_FIELD_NAMES){
			String maskPattern = classFieldName.concat("=(.*?),");
			this.maskPatterns.add(maskPattern);
			maskPattern = classFieldName.concat("=(.*?)\\)");
			this.maskPatterns.add(maskPattern);
			this.multilinePattern = Pattern.compile(String.join("|", this.maskPatterns), Pattern.MULTILINE);
		}
		super.start();
	}

	@Override
	public String doLayout(ILoggingEvent event) {
		return this.maskMessage(super.doLayout(event));
	}

	private String maskMessage(String message) {
		if (this.multilinePattern == null) {
			return message;
		}

		final StringBuilder sb = new StringBuilder(message);
		final Matcher matcher = this.multilinePattern.matcher(sb);

		while (matcher.find()) {
			IntStream.rangeClosed(1, matcher.groupCount()).forEach(group -> {
				if (matcher.group(group) != null) {
					IntStream.range(matcher.start(group), matcher.end(group)).forEach(i -> sb.setCharAt(i, '*'));
				}
			});
		}

		return sb.toString();
	}

}
