//largest element in an array
public class q1 {

    // Returns the largest element in a non-empty array.
    public static int largest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must be non-null and non-empty");
        }

        int max = arr[0];                 // 1) initialize with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {           // 2) if current is greater, update
                max = arr[i];
            }
        }
        return max;                       // 3) final largest value
    }

    // Quick test
    public static void main(String[] args) {
        int[] a1 = {2, 7, 11, 15};
        int[] a2 = {-5, -2, -9, -1};
        System.out.println(largest(a1)); // 15
        System.out.println(largest(a2)); // -1
    }
}
