public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome checker Management System");
        System.out.println("Version:1.0");
        System.out.println("System Initialized Succesfully");
        String input = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("String: \"" + input + "\"");
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
