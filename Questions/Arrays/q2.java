// second largest element in java

public class q2 {
    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // second largest possible hi nahi
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x > first) {             // naya largest mila
                second = first;
                first = x;
            } else if (x > second && x != first) {
                // x largest ke equal nahi hai aur second se bada hai
                second = x;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 5, 20, 8};
        int[] a2 = {10, 10, 9};
        int[] a3 = {5, 5, 5};

        System.out.println(secondLargest(a1)); // 10
        System.out.println(secondLargest(a2)); // 9
        System.out.println(secondLargest(a3)); // -1 (nahi hai)
    }
}
