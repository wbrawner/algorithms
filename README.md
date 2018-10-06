# Algorithms

This repository is meant for me to compile a list of examples of different 
algorithms that I have learned of, and develop a working implementation. 
These implementations may not be the most efficient, so please do point it 
out to me if you see something that could be improved upon. The complexity 
notations were taken from the  [Big O Cheatsheet](http://bigocheatsheet.com/)

### Sorting

Algorithm|Implementation|Tests|Worst Time Complexity|Worst Space Complexity
-----|-----|-----|-----|-----
[Insertion Sort](https://en.wikipedia.org/wiki/Insertion_sort)|[InsertionSort.java](sorting/src/main/java/com/wbrawner/algorithms/sorting/InsertionSort.java)|[ParameterizedInsertionSortTest.java](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedInsertionSortTest.java)|O(n²)|O(1)
[Merge Sort](https://en.wikipedia.org/wiki/Merge_sort)|[MergeSort.java](sorting/src/main/java/com/wbrawner/algorithms/sorting/MergeSort.java)|[ParameterizedMergeSortTest.java](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedMergeSortTest.java)|O(n log(n))|O(n)

## Building/Testing

    ./gradlew test
    
To keep things simple, the tests share the same data where possible.

- [Sorting algorithms test data](sorting/src/test/java/com/wbrawner/algorithms/sorting/SortData.java)