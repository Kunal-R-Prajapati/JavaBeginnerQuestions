import java.util.Arrays;
import java.util.Scanner;

class question18 {

    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    // Driver Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Elements in arr : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int index = -1;
        System.out.print("Enter the number to search in array : ");
        int k = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (arr[i] == k) {
                index = i;
            }
        }
        if (index != -1) {
            arr = removeTheElement(arr, index);
            System.out.println("Element is removed From the array.");
            // Print the resultant array
            System.out.println("Resultant Array: " + Arrays.toString(arr));
        } else {
            System.out.println("The Element is not found.");
        }

        sc.close();
    }
}
