public class Q16{
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        
        try {
           
            int value = array[3];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
