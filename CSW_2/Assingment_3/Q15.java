public class Q15 {
    public static void main(String[] args) {
        String i = "harish";
        
        try {
            
            int n = Integer.parseInt(i);
            
            try {
                
                int r = 10 / n;
                System.out.println("Result: " + r);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException in inner block.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: NumberFormatException in outer block.");
        }
    }
}
