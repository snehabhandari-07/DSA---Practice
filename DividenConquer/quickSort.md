# Quick Sort

-In Quick Sort we use pivot and partition method which is similar to divide and Conquer\
-Pivot is selected and on that basis the whole array is divided\
-Pivot is the basically the element of an array, around which we do the left and right partitions for ex - elements smaller to pivot are on left array and vice versa\
-Pivot can be any random element in an array or it can be first element or last element or median\
-In most of the cases we assume pivot as a last element if array is not sorted\

Step 1 - Select the pivot \
Step 2 - On the basis of pivot, partition the array into left part and right part \
       - left part has elements smaller than pivot
       - right part has elements greater than pivot\
Step 3 - Call quickSort for left and right part \

Actual work is done by the partition function. It is responsible for arranging the elements in correct order\

# TC & SC
TC - O(n log n)\
In worst case - O(n^2)\
-Worst case happens when pivot is choosen as smallest or largest element in an array because during partition we have - and n - 1 partitions which leads to having a O(n^2) as TC\
-To avoid worst case always select pivot as a random element or choose median of 1st, last and middle\


SC - O(1)\
As changes are done in original array 

When space needs to be constant choose quick Sort
