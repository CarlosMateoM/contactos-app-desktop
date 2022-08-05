package configurations;

import components.Message;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Config {

    public static Properties config = new Properties();
    public static InputStream configInput = null;
    public static OutputStream configOutput = null;

    public static void setPropertyValue(String property, String value) {
        try {
            configOutput = new FileOutputStream("config/config.properties");
            config.setProperty(property, value);
            config.store(configOutput, null);
            configOutput.close();
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            new Message("¡Error al guardar las configuraciones!");
        }
    }

    public static String getPropertyValue(String property) {
        try {
            configInput = new FileInputStream("config/config.properties");
            config.load(configInput);
            return config.getProperty(property);
        } catch (IOException e) {
            new Message("¡Erro al leer las configuraciones!");
        }
        return null;
    }
}
