class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            String str = null;
            if (str == null) {
                throw new CustomNullPointerException("Custom Null Pointer Exception: String is empty");
            }
        } catch (CustomNullPointerException e) {
            System.err.println("CustomNullPointerException: " + e.getMessage());
        }
    }
}