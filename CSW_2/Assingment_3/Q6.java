import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String i = sc.nextLine();

        try {
            int n = Integer.parseInt(i);
            System.out.println("No. entered: " + n);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}
