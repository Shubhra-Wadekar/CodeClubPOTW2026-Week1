# CodeClubPOTW2026-Week1
Solutions of questions of Code club CCOEW POTW 2026 week 1

**Level 0:**
1. *Add Digits: (leetcode 258)*

   Instead of looping or recursively adding the digits a simple approach that cost constant time complexity would be finding the digital root. That means taking num%9 is equivalent to adding digits(Handling edges cases for 0 and multiples of 9).

2. *Water Bottles: (leetcode 1518)*

   The approach is simple.
   Drink all the available full bottles.
   Then count number of sets you can exchange for a full bottle.
   Also keep the count of the remaining bottles after each exchange.
   Calculate available bottles by adding the new exchanged bottles with the remaining bottles.
   
---
**Level 1:**
1. *Height checker: (leetcode 1051)*

   Uses Counting Sort to build a frequency array of heights, then traverses the original array while reconstructing the sorted order. Counts positions where the original height differs from the expected sorted height.

2. *Successful Pairs of Spells and Potions: (leetcode 2300)*

   Sorts the potions array and uses Binary Search for each spell to find the first potion that forms a successful pair (product ≥ success). The number of successful pairs is the number of potions from that index to the end.

Time Complexity: (O(mlog m+nlog m)), where (m) = potions length and (n) = spells length.
      
---
**Level 2:**
1. *Check if N and it's double exists: (leetcode 1346)*

  Sorts the array and uses Binary Search for each element to find its double. Searches the right half for positive numbers and the left half for negative numbers to avoid matching the element with itself.

2. *Maximum Difference between adjacent elements in circular array:(leetcode 3423)*

   Traverses the array and calculates the absolute difference between every pair of adjacent elements, using modulo (%) to handle the circular adjacency between the last and first elements. Keeps track of the maximum difference.
   

