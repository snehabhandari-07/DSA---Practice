public class mergeSort {
    // Print Array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive Function
    public static void mergeSorting(int arr[], int si, int ei) {
        // si - starting index
        // ei - ending index

        // Base Case - When Starting index == Ending index => meaning single element
        if (si >= ei) {
            return;
        } // si > ei ==> This is invalid condition so to handle that add that in base case

        // Calculate middle
        int mid = si + (ei - si) / 2; // this is same as (si + ei) / 2

        // Call for left part (starting index to middle)
        mergeSorting(arr, si, mid);

        // Call for right part (middle + 1 to ending index)
        mergeSorting(arr, mid + 1, ei);

        // Assume, Through recursive call we will get single elements and call merge
        // function to compare and merge them in final array
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {
        // Make a temp array
        int temp[] = new int[ei - si + 1];

        // i to point towards the left part of array
        int i = si;

        // j to point towards the right part of array
        int j = mid + 1;

        // k to point to temp array index 0
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half (if any)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy elements from temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 2, 3, 4 };
        System.out.println("Before Sorting:");
        printArray(arr);

        mergeSorting(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}