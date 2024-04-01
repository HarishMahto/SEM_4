public class Q20 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        recursiveTraversal(array, 0);
    }

    public static void recursiveTraversal(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Traversal terminated.");
            return;
        }

        try {
            System.out.println("Element at index " + index + ": " + array[index]);

            recursiveTraversal(array, index + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Reached end of array. Traversal terminated.");
        }
    }
}
