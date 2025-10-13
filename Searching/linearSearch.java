// in this code we have done linear search in an array 
// we perform two ways after sorting and with sorting


import java.util.*;
public class linearSearch {
    public static int LinearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==target) return i;
        }
        return -1; // Element not found
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //  // Sort the array before searching
        // Arrays.sort(arr);

        // // Display sorted array
        // System.out.println("Sorted array is:");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();

        int res= LinearSearch(arr, target);
        if(res == -1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + res);
        }
    }
    
}
//