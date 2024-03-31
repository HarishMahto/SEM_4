

public class Q12 {
    public static void main(String[] args) {

        try {
            double x = 120.0;
            double r = calculate(x);
            System.out.println("Result of the expression: " + r);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } 
    }

    public static double calculate(double x) {
        double sin = Math.sin(x);
        double cos = Math.cos(x);
        double tan = Math.tan(x);

        if (Math.abs(tan + 1) < 1e-9) {
            throw new ArithmeticException("Division by zero error");
        }

        double a = Math.abs(sin * cos);

        if (a < 0) {
            throw new IllegalArgumentException("Square root of negative value is undefined.");
        }

        double s = Math.sqrt(a);
        double d = tan + 1;
        return s / d;
    }
}
