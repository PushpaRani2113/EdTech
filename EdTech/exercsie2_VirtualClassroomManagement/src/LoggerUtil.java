import java.io.IOException;
import java.util.logging.*;

public class LoggerUtil {
    public static Logger createLogger(Class<?> cls) {
        Logger logger = Logger.getLogger(cls.getName());
        try {
            Handler fileHandler = new FileHandler("application.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error initializing logger", e);
        }
        return logger;
    }
}
