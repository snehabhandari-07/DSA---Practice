public class Basic1 {
    // Question 1
    // Print numbers in decreasing Order
    public static void printDec(int num) {
        // base case
        if (num == 0) {
            return; // return if value reaches to 0 (break the function)
        }

        System.out.print(num + " "); // Print num first
        printDec(num - 1); // Then call the same function for num - 1
    }

    // Question 2
    // Print numbers in increasing Order
    public static void printInc(int num) {
        // base case
        if (num == 0) {
            return;
        }

        printInc(num - 1);
        System.out.print(num + " ");
    }

    // Question 2
    // Find Factorial of a number
    public static int printFact(int num) {
        // base case
        if (num == 1) {
            return 1;
        }

        return num * printFact(num - 1);
        // ex - 5 * 4 * 3 * 2 * 1
    }

    // Question 3
    // Find Sum of N Natural Numbers
    public static int sumofN(int num) {
        // base case
        if (num == 1) {
            return 1;
        }

        return num + sumofN(num - 1);
        // ex - 5 + 4 + 3 + 2 + 1
    }

    // Question 4
    // Find Nth Fibonacci Number
    public static int printNthFib(int num) {
        // base case
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        return printNthFib(num - 1) + printNthFib(num - 2);
    }

    // Question 5
    // Check is Array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        // base case
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(arr, 0));
        // input
        // int num = 6;
        // printDec(num);
        // System.out.println();
        // printInc(num);
        // System.out.println(sumofN(num));
        // System.out.println(printNthFib(num));

    }
}