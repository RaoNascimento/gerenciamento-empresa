package br.com.strella.srv.empresa.domain.exception;

public class ArquivoNotFoudException extends BusinessException {

    private static final long serialVersionUID = 1L;
    private final String errorCode;
    private final String errorMsg;

    public ArquivoNotFoudException(String errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ArquivoNotFoudException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public String getErrCode() {
        return errorCode;
    }

    @Override
    public String getErrMsg() {
        return errorMsg;
    }

}
