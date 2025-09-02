// reverse words in a given string /palindrome check
import java.util.Scanner;

public class q2 {
    
    // (a) Reverse Words
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // split by spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }
        return result.toString();
    }

    // (b) Palindrome Check
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Reverse Words in a String");
        System.out.println("2. Palindrome Check");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            System.out.println("Reversed Words: " + reverseWords(sentence));
        } else if (choice == 2) {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            if (isPalindrome(word)) {
                System.out.println(word + " is a Palindrome ✅");
            } else {
                System.out.println(word + " is NOT a Palindrome ❌");
            }
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
