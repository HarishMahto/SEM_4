public class Q5 {
    public static void main(String[] args) {
        try {
            double result = performComputation();
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.err.println("Error: NullPointerException occurred.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static double performComputation() {
        double pi = Math.PI;
        double O = 0 * pi / 4;
        
        double sin = Math.sin(O);
        
        double sqrt = Math.sqrt(16);
        
        return sqrt+sin;
        
    }
}
