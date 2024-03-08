package Singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger{

    private static LoggerImpl logger;

    private String logFilePath;

    private PrintWriter logWriter;

    public LoggerImpl() {
    }

    public static LoggerImpl getInstance() {
        if (logger == null) {
            synchronized (LoggerImpl.class) {
                if (logger == null) {
                    logger = new LoggerImpl();
                }
            }
        }
        return logger;
    }

    public static void resetInstance() {
        logger = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if (logWriter == null) {
            throw new IllegalStateException("Logger is not Initialized");
        }
        String logMessage = "Timestamp: " + LocalDateTime.now() + ", Level: " + level.name() + ", Message: " + message;
        logWriter.println(logMessage);
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            logWriter = new PrintWriter(new FileWriter(filePath, true));
            logFilePath = filePath;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getLogFile() {
        return logFilePath;
    }

    @Override
    public void flush() {
        if (logWriter != null)
            logWriter.flush();
    }

    @Override
    public void close() {
        if (logWriter != null) {
            logWriter.close();
            logWriter = null;
        }
    }
}
