public class Q2 {
    public static void main(String[] args) {
        String s = "";
        
        try {
            if (s == null || s.isEmpty()) {
                throw new NullPointerException("Input string is empty");
            }

            boolean numericCharFound = false;

            for (int i = 0; i < s.length() - 2; i++) {
                char c = s.charAt(i);
                char n = s.charAt(i + 1);
                char nn = s.charAt(i + 2);

                if (isVowel(c) && Character.isAlphabetic(n) && Character.isDigit(nn)) {
                    System.out.println("Numeric character: " + nn);
                    numericCharFound = true;
                }
            }

            if (!numericCharFound) {
                System.out.println("No numeric characters preceded by a vowel and consonant found.");
            }
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
