//anagram
import java.util.*;

public class q4 {
    public static boolean isAnagram(String s, String t) {
        // agar length alag hai to turant false
        if (s.length() != t.length()) return false;

        // string ko char array me convert karke sort karo
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // dono arrays same hain to anagram
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("Yes, the strings are Anagram ✅");
        } else {
            System.out.println("No, the strings are NOT Anagram ❌");
        }

        sc.close();

        //change

        


    }
}
