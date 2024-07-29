public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Performing some operations...");
        try {
            int result = 10 / 0; // This will cause an exception
        } catch (Exception e) {
            logger.log("Error occurred: " + e.getMessage());
        }
        logger.log("Application finished {0}.");
        logger.close();
    }
}
