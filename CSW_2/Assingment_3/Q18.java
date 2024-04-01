public class Q18 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        rec(a, 0);
    }

    public static void rec(int[] a, int i) {
        
        if (i < 0 || i >= a.length) {
            System.out.println("Traversal terminated.");
            return;
        }

        System.out.println("Element at index " + i + ": " + a[i]);

        try {
            rec(a, i + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Reached end of array. Traversal terminated.");
        }
    }
}
