// Check if two strings are Isomorphic or not
import java.util.*;

public class q3 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i); // character from s
            char c2 = t.charAt(i); // character from t

            if (map.containsKey(c1)) {
                // pehle se mapping hai, check karo consistent hai ya nahi
                if (map.get(c1) != c2) {
                    return false; // conflict
                }
            } else {
                // new mapping banani hai
                if (used.contains(c2)) {
                    return false; // koi aur already c2 use kar chuka hai
                }
                map.put(c1, c2); // map c1 -> c2
                used.add(c2);    // mark c2 as used
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isIsomorphic(s, t)) {
            System.out.println("Yes, the strings are Isomorphic ✅");
        } else {
            System.out.println("No, the strings are NOT Isomorphic ❌");
        }

        sc.close();
    }
}

//jh