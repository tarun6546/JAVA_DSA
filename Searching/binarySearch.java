
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size and elements of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Optional: Sort the array (use only if the user doesn't enter sorted input)
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Step 2: Input the target value to search
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // Step 3: Perform Binary Search
        int result = binarySearch(arr, target);

        // Step 4: Print the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    // Binary Search function (iterative)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // prevents overflow

            if (arr[mid] == target) {
                return mid; // found
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // not found
    }
}
