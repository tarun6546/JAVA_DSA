//Sorting characters by frequency
import java.util.*;

class q1 {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String input = sc.nextLine();

        q1 sol = new q1();
        String result = sol.reverseWords(input);

        System.out.println(result);
        sc.close();
    }
}
