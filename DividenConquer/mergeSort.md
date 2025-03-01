# Code for merge Sort
    Step 1 - Identify starting index and ending index, On basis of that find the mid of array
    Step 2 - Divide the array into left and right parts 
    Step 3 - Division of the left and right part should be recursive
    Step 4 - Assume recursion will sort the array as division will continue till only one single element remains (Single element is always Sorted)
    Step 5 - After division merge the array
                - For merging array i.e of left part and right part use pointers 
                Using Pointers compare elements from left and right part and the one smaller will be placed in a temp array 
    Step 6 - Copy temp array into original array

# TC - O(n log n) 
# SC - O(n) as it uses the temp array 
       
       Merge Sort is a one of the stable sorting and is perferred to use in linked list rather than arrays