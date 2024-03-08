import Singleton.LogLevel;
import Singleton.LoggerImpl;

public class SingletonClient {
    private static final LoggerImpl logger = LoggerImpl.getInstance();

    public static void main(String[] args) {
        System.out.println(logger);
        logger.setLogFile("/Users/akhil/Developer/Workspace/Java/LLD/DesignPatterns/service.log");
        System.out.println("Log File Path: " +logger.getLogFile());
        logger.log(LogLevel.INFO, "Hello World");
        logger.flush();
        logger.close();
    }
}
