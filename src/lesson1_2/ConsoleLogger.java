package lesson1_2;

import java.time.LocalDateTime;

public class ConsoleLogger {
    private final static ConsoleLogger instance;

    static {
        instance = new ConsoleLogger();
    }

    public static ConsoleLogger getLogger() {
        return instance;
    }

    private ConsoleLogger() {}

    public void info(String message) {
        System.out.println(LocalDateTime.now() + " " + message);
    }

    public void error(String error) {
        System.err.println(LocalDateTime.now() + " " + error);
    }
}
