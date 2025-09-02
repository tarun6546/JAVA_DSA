//remove outermost parenthesis

import java.util.Scanner;

class q1{
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0; // current nesting depth

        // normal for-loop (index based), NOT for-each
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                // agar current depth > 0 hai to yeh "(" result me add karo
                if (depth > 0) {
                    result.append(c);
                }
                depth++; // '(' se depth badh jaati hai
            } else { // c == ')'
                depth--; // pehle depth ghatate hain kyunki ')' close karta hai
                // agar depth ab bhi > 0 hai to yeh ')' result me add karo
                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        q1 sol = new q1();
        String ans = sol.removeOuterParentheses(s);

        System.out.println("Result after removing outermost parentheses: " + ans);
        
        sc.close();
    }
}
