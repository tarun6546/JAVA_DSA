//maximum nesting depth of parenthesis

import java.util.*;

class Solution {
    public int maxDepth(String s) {
        int max = 0, curr = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                curr++;
                if (curr > max)
                    max = curr;
            } else if (ch == ')') {
                curr--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with parentheses:");
        String input = sc.nextLine();

        Solution sol = new Solution();
        int result = sol.maxDepth(input);

        System.out.println("Maximum Depth: " + result);
        sc.close();
    }
}
