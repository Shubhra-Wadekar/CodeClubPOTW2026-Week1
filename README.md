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
   
