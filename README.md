# Algorithms

This repository is meant for me to compile a list of examples of different 
algorithms that I have learned of, and develop a working implementation. 
These implementations may not be the most efficient, so please do point it 
out to me if you see something that could be improved upon. The complexity 
notations were taken primarily from the  [Big O Cheat Sheet](http://bigocheatsheet.com/)

### Searching

Algorithm|Implementation|Tests|Worst Time Complexity|Worst Space Complexity
-----|-----|-----|:-----:|:-----:
[Binary Search](https://en.wikipedia.org/wiki/Binary_search_algorithm)|[BinarySearch.java](searching/src/main/java/com/wbrawner/algorithms/searching/BinarySearch.java)|[ParameterizedBinarySearchTest.java](searching/src/test/java/com/wbrawner/algorithms/searching/ParameterizedBinarySearchTest.java)|O(log n)|O(1)
[Fibonacci Search](https://en.wikipedia.org/wiki/Fibonacci_search_technique)|[FibonacciSearch.java](searching/src/main/java/com/wbrawner/algorithms/searching/FibonacciSearch.java)|[ParameterizedFibonacciSearchTest.java](searching/src/test/java/com/wbrawner/algorithms/searching/ParameterizedFibonacciSearchTest.java)|O(log n)|O(1)
[Linear Search](https://en.wikipedia.org/wiki/Linear_search)|[LinearSearch.java](searching/src/main/java/com/wbrawner/algorithms/searching/LinearSearch.java)|[ParameterizedLinearSearchTest.java](searching/src/test/java/com/wbrawner/algorithms/searching/ParameterizedLinearSearchTest.java)|O(n)|O(1)

### Sorting

Algorithm|Implementation|Tests|Worst Time Complexity|Worst Space Complexity
-----|-----|-----|:-----:|:-----:
[Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort)|[BubbleSort.java](sorting/src/main/java/com/wbrawner/algorithms/sorting/BubbleSort.java)|[ParameterizedBubbleSortTest.java](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedBubbleSortTest.java)|O(n²)|O(1)
[Insertion Sort](https://en.wikipedia.org/wiki/Insertion_sort)|[InsertionSort.java](sorting/src/main/java/com/wbrawner/algorithms/sorting/InsertionSort.java)|[ParameterizedInsertionSortTest.java](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedInsertionSortTest.java)|O(n²)|O(1)
[Merge Sort](https://en.wikipedia.org/wiki/Merge_sort)|[MergeSort.java](sorting/src/main/java/com/wbrawner/algorithms/sorting/MergeSort.java)|[ParameterizedMergeSortTest.java](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedMergeSortTest.java)|O(n log(n))|O(n)
[Selection Sort](https://en.wikipedia.org/wiki/Selection_sort)|[SelectionSort.java](sorting/src/main/java/com/wbrawner/algorithms/sorting/SelectionSort.java)|[ParameterizedSelectionSortTest.java](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedSelectionSortTest.java)|O(n²)|O(1)

## Building/Testing

    ./gradlew test
    
To keep things simple, the tests share the same data where possible.

- [Searching algorithms test data](searching/src/test/java/com/wbrawner/algorithms/searching/SearchData.java)
- [Sorting algorithms test data](sorting/src/test/java/com/wbrawner/algorithms/sorting/SortData.java)