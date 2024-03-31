import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String input = sc.nextLine();

        int n = convertToInteger(input);
        System.out.println("Converted integer: " + n);

        sc.close();
    }

    public static int convertToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Error: Enter a valid integer number.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a valid number as string: ");
            String newInput = sc.nextLine();
            return convertToInteger(newInput);
        }
    }
}
