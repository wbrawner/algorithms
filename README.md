# Algorithms

This repository is meant for me to compile a list of examples of different 
algorithms that I have learned of, and develop a working implementation. 
These implementations may not be the most efficient, so please do point it 
out to me if you see something that could be improved upon.

## Sorting

- [Merge Sort](sorting/src/main/java/com/wbrawner/algorithms/sorting/MergeSort.java)
  - [Tests](sorting/src/test/java/com/wbrawner/algorithms/sorting/ParameterizedMergeSortTest.java) 

## Building/Testing

    ./gradlew test
    
To keep things simple, the tests share the same data where possible.

- [Sorting test data](sorting/src/test/java/com/wbrawner/algorithms/sorting/SortData.java)