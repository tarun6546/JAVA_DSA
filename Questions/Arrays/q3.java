// array is sorted or not

public class q3{
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // ulta mila to sorted nahi
            }
        }
        return true; // kahin bhi ulta nahi mila to sorted hai
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {10, 20, 15, 30};
        int[] a3 = {5, 5, 5, 5};

        System.out.println(isSorted(a1)); // true
        System.out.println(isSorted(a2)); // false
        System.out.println(isSorted(a3)); // true
    }
}
