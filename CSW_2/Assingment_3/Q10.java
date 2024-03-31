import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value in radians: ");
            double x = sc.nextDouble();

            double r = calculateExpression(x);
            System.out.println("Result: " + r);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double calculateExpression(double x) {
        if (Math.abs(x - Math.PI / 2) < 0.0001 || Math.abs(x - 3 * Math.PI / 2) < 0.0001) {
            System.err.println("Error: Division by zero is not possible.");
            return Double.NaN;
        }

        double sin = Math.sin(x);
        double cos = Math.cos(x);
        double tan = Math.tan(x);

        return (sin + cos) / tan;
    }
}
