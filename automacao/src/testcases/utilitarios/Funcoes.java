package utilitarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class Funcoes {

    public static String getEnvironment() {
        return Optional.ofNullable(System.getProperty("environment")).orElse("DEV");
    }

    public static Properties getProperties() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("./properties/dados.properties");
        props.load(file);
        return props;
    }
}
