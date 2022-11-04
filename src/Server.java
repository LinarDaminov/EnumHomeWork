public class Server {
    public static String checkCondition(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }


}




