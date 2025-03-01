public class quickSort {
    // Print Array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive quick sort function
    public static void quickSorting(int arr[], int si, int ei) {
        // si - starting index of array
        // ei - ending index of array

        // Base Case
        if (si >= ei) {
            return;
        }

        // Select a pivot and on basis of that pivot partition the array
        // pivot in this is considered as ending index
        int pIndex = parition(arr, si, ei); // this gives the pivot index after partition assuming pivot is right place

        // Call quick sort for left part
        // pIndex - 1 because pivot is at right place
        quickSorting(arr, si, pIndex - 1);

        // Call quick sort for right part
        quickSorting(arr, pIndex + 1, ei);
    }

    public static int parition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // pivot is considered as a last element

        int i = si - 1; // as the adjustments are gona happen in same array consider i at -1
        // i is responsible for actually making place

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Place the pivot in the correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

        // i is the index of pivot
    }

    public static void main(String args[]) {
        int arr[] = { 5, 6, 7, 1, 2, 3 };
        quickSorting(arr, 0, arr.length - 1);
        printArr(arr);

    }
}