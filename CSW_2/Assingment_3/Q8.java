import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");

        try {
            int n = sc.nextInt();
            double s = findSquareRoot(n);
            System.out.println("Square root of " + n + " is: " + s);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException occurred. Cannot find square root of a negative number.");
        } finally {
            sc.close();
        }
    }

    public static double findSquareRoot(int n) throws ArithmeticException {
    	if (n < 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(n);
    }
}
