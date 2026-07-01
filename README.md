# Lab 2 — Array Algorithms

**Course:** DCIT 204 — Data Structures and Algorithms I
**Student:** Clifford
**Student ID:** 22381705
**Branch:** clifford_22381705

## Overview

This lab implements two fundamental array algorithms as interactive
console applications using Java's `Scanner` class for all input:

1. **FindMax.java** — Finds the maximum value in a user-supplied
   array and reports the index at which it occurs.
2. **PairSum.java** — Uses a brute-force (nested loop) search to
   find a unique pair of array elements whose sum equals a
   user-supplied target value.

## Files

```
Lab2/
├── FindMax.java
├── PairSum.java
└── README.md
```

## How to Compile and Run

From inside the `Lab2` directory:

```bash
javac FindMax.java
java FindMax
```

```bash
javac PairSum.java
java PairSum
```

## Task 1: Find Maximum — Algorithm Summary

- Prompts the user for the array size, then each element.
- Performs a single linear scan through the array, tracking the
  largest value seen so far and its index.
- **Time Complexity:** O(n) — each element is visited exactly once.
- **Space Complexity:** O(n) — for storing the input array.

### Sample Run

```
Enter the number of elements in the array: 5
Enter 5 integer values:
  Element[0]: 3
  Element[1]: 8
  Element[2]: 1
  Element[3]: 9
  Element[4]: 4

===== Find Maximum: Results =====
Array Entered: [3, 8, 1, 9, 4]
Maximum Value : 9
Found at Index: 3
==================================
```

## Task 2: Pair Sum (Brute Force) — Algorithm Summary

- Prompts the user for the array size, each element, and a target
  sum.
- Uses two nested loops to check every possible pair (i, j), where
  i < j, stopping as soon as a matching pair is found.
- **Time Complexity:** O(n²) — worst case checks every pair.
- **Space Complexity:** O(n) — for storing the input array.

### Sample Run

```
Enter the number of elements in the array: 5
Enter 5 integer values:
  Element[0]: 2
  Element[1]: 7
  Element[2]: 11
  Element[3]: 15
  Element[4]: 3
Enter the Target Sum: 9

===== Pair Sum (Brute Force): Results =====
Pair Found!
Index A: 0  ->  Value: 2
Index B: 1  ->  Value: 7
Equation: 2 + 7 = 9
=============================================
```

### No-Match Example

```
Enter the Target Sum: 100

===== Pair Sum (Brute Force): Results =====
No pair was found that sums to 100.
=============================================
```

## Learning Outcomes

- Working confidently with arrays.
- Accepting user input using `Scanner`.
- Implementing linear search.
- Implementing brute-force pair search.
- Analyzing algorithm time complexity (O(n) vs O(n²)).
- Writing clean, maintainable Java code.
- Using Git and GitHub for version control.
