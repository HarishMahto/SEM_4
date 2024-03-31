import java.util.Scanner;

public class Q13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();

            double result = evaluateFunction(x);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException occurred. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double evaluateFunction(double x) {
        double sin = Math.sin(x);
        double cos = Math.cos(x);

        if (Double.isNaN(sin) || Double.isNaN(cos) || sin + cos == 0) {
            throw new ArithmeticException("Invalid mathematical operations occurred.");
        }
        return (sin * cos) / (sin + cos);
    }
}
