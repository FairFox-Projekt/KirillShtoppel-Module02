//здесь принцип DRY
//Использование параметризованных методов
class Logger {
    private void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
    public void logError(String message) {
        log("ERROR", message);
    }
    public void logWarning(String message) {
        log("WARNING", message);
    }
    public void logInfo(String message) {
        log("INFO", message);
    }
}
//Использование общих конфигурационных настроек
class Config {
    public static String connectionString =
            "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}
class DatabaseService {
    public void connect() {
        String conn = Config.connectionString;
        System.out.println("Connecting with: " + conn);
    }
}
class LoggingService {
    public void log(String message) {
        String conn = Config.connectionString;
        System.out.println("Logging to DB with: " + conn + " -> " + message);
    }
}
