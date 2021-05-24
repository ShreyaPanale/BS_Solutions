## Problem Statement : 
Given the head of a singly linked list head, return whether the values of the nodes are sorted in a strictly increasing order.

**Constraints :**
n ≤ 100,000 where n is the number of nodes in head

### Example 1

**Input :**
node = 1 -> 5 -> 9 -> 9

**Output :**
False

**Explanation :**
Even though this list is sorted, it's not strictly increasing since 9 is repeated.

### Example 2

**Input :**
node = 1 -> 5 -> 8 -> 9

**Output :**
True

**Explanation :**
The values 1, 5, 8, 9 are strictly increasing.