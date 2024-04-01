public class Q28 {

    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int i) {
        System.out.println("Method call number: " + i);
        recursiveMethod(i + 1);
    }
}
