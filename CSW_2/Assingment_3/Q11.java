import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            double x = sc.nextDouble();
            double r = calculate(x);
            System.out.println("Result: " + r);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double calculate(double x) {
        double sin = Math.sin(x);
        double cos = Math.cos(x);
        double tan = Math.tan(x);
        double cot = 1 / tan;
        if (Double.isNaN(sin) || Double.isNaN(cos) || Double.isNaN(tan) || Double.isNaN(cot) ||
            Double.isInfinite(sin) || Double.isInfinite(cos) || Double.isInfinite(tan) || Double.isInfinite(cot)) {
            throw new IllegalArgumentException("Invalid mathematical operations for the given value of x.");
        }

        double n = Math.log(sin + cos);
        double d = tan - cot;

        if (d == 0) {
            throw new ArithmeticException("Division by zero error occurred.");
        }

        return n / d;
    }
}
