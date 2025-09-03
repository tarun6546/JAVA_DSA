//one string is sa rotaion of other or not
import java.util.*;

public class q5 {
    public static boolean isRotation(String s1, String s2) {
        // length different → not rotation
        if (s1.length() != s2.length()) {
            return false;
        }

        // double string1
        String doubled = s1 + s1;

        // check if s2 is substring of doubled
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (isRotation(s1, s2)) {
            System.out.println("Yes, the strings are Rotations ✅");
        } else {
            System.out.println("No, the strings are NOT Rotations ❌");
        }

        sc.close();
    }
}
