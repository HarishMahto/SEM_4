import java.lang.Math;

public class Q14 {
    public static void main(String[] args) {
        double x = 1.5;
        
        try {
            double result = calculateExpression(x);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic Exception occurred.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: IllegalArgumentException occurred.");
        }
    }

    public static double calculateExpression(double x) {
        double n = Math.log(Math.abs(Math.sin(x) + Math.cos(x)));
        double d = Math.tan(x) - (1 / Math.tan(x));

        if (Double.isNaN(n) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Invalid input: x caused a NaN result.");
        }

        if (Double.isInfinite(n) || Double.isInfinite(d)) {
            throw new ArithmeticException("Invalid input: x caused an infinite result.");
        }

        if (d == 0) {
            throw new ArithmeticException("Division by zero occurred.");
        }

        return n / d;
    }
}
