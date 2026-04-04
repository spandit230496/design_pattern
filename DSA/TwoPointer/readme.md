# 📘 Two Pointer Patterns – Complete Guide

Mastering Two Pointers is essential for **coding interviews (Amazon, Flipkart, Google)**.
This README covers **all sub-patterns + must-do LeetCode problems**.

---

# 🚀 What is Two Pointer?

Two pointer technique uses **two indices** to iterate over data efficiently.

👉 Reduces time complexity from **O(n²) → O(n)** in many problems.

---

# 🧠 When to Use?

* Sorted arrays
* Subarrays / substrings
* Pair / triplet problems
* In-place modifications
* Linked list cycles

---

# 📂 Patterns Covered

* Opposite Direction
* Same Direction (Fast & Slow)
* Sliding Window
* Fixed Window
* Cycle Detection
* Partitioning
* Three Pointer
* Merge Style
* Expand Around Center

---

# 🔹 1. Opposite Direction (Converging Pointers)

📌 Use when:

* Sorted array
* Pair problems

### Problems:

* [https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
* [https://leetcode.com/problems/valid-palindrome/](https://leetcode.com/problems/valid-palindrome/)
* [https://leetcode.com/problems/container-with-most-water/](https://leetcode.com/problems/container-with-most-water/)
* [https://leetcode.com/problems/3sum/](https://leetcode.com/problems/3sum/)
* [https://leetcode.com/problems/trapping-rain-water/](https://leetcode.com/problems/trapping-rain-water/)
* [https://leetcode.com/problems/squares-of-a-sorted-array/](https://leetcode.com/problems/squares-of-a-sorted-array/)
* [https://leetcode.com/problems/reverse-string/](https://leetcode.com/problems/reverse-string/)
* [https://leetcode.com/problems/boats-to-save-people/](https://leetcode.com/problems/boats-to-save-people/)
* [https://leetcode.com/problems/sort-transformed-array/](https://leetcode.com/problems/sort-transformed-array/)
* [https://leetcode.com/problems/remove-palindromic-subsequences/](https://leetcode.com/problems/remove-palindromic-subsequences/)

---

# 🔹 2. Same Direction (Fast & Slow Pointer)

📌 Use when:

* In-place updates
* Removing duplicates

### Problems:

* [https://leetcode.com/problems/remove-duplicates-from-sorted-array/](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
* [https://leetcode.com/problems/remove-element/](https://leetcode.com/problems/remove-element/)
* [https://leetcode.com/problems/move-zeroes/](https://leetcode.com/problems/move-zeroes/)
* [https://leetcode.com/problems/sort-array-by-parity/](https://leetcode.com/problems/sort-array-by-parity/)
* [https://leetcode.com/problems/duplicate-zeros/](https://leetcode.com/problems/duplicate-zeros/)
* [https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
* [https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)
* [https://leetcode.com/problems/merge-sorted-array/](https://leetcode.com/problems/merge-sorted-array/)
* [https://leetcode.com/problems/partition-array-according-to-given-pivot/](https://leetcode.com/problems/partition-array-according-to-given-pivot/)
* [https://leetcode.com/problems/apply-operations-to-an-array/](https://leetcode.com/problems/apply-operations-to-an-array/)

---

# 🔹 3. Sliding Window (Dynamic Window) ⭐ MOST IMPORTANT

📌 Use when:

* Subarray / substring
* Variable size window

### Problems:

* [https://leetcode.com/problems/longest-substring-without-repeating-characters/](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
* [https://leetcode.com/problems/minimum-window-substring/](https://leetcode.com/problems/minimum-window-substring/)
* [https://leetcode.com/problems/longest-repeating-character-replacement/](https://leetcode.com/problems/longest-repeating-character-replacement/)
* [https://leetcode.com/problems/permutation-in-string/](https://leetcode.com/problems/permutation-in-string/)
* [https://leetcode.com/problems/find-all-anagrams-in-a-string/](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
* [https://leetcode.com/problems/subarrays-with-k-different-integers/](https://leetcode.com/problems/subarrays-with-k-different-integers/)
* [https://leetcode.com/problems/binary-subarrays-with-sum/](https://leetcode.com/problems/binary-subarrays-with-sum/)
* [https://leetcode.com/problems/fruit-into-baskets/](https://leetcode.com/problems/fruit-into-baskets/)
* [https://leetcode.com/problems/count-number-of-nice-subarrays/](https://leetcode.com/problems/count-number-of-nice-subarrays/)
* [https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)

---

# 🔹 4. Fixed Window

📌 Use when:

* Window size = k

### Problems:

* [https://leetcode.com/problems/maximum-average-subarray-i/](https://leetcode.com/problems/maximum-average-subarray-i/)
* [https://leetcode.com/problems/find-all-anagrams-in-a-string/](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
* [https://leetcode.com/problems/sliding-window-maximum/](https://leetcode.com/problems/sliding-window-maximum/)
* [https://leetcode.com/problems/k-radius-subarray-averages/](https://leetcode.com/problems/k-radius-subarray-averages/)
* [https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/)
* [https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/](https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/)
* [https://leetcode.com/problems/grumpy-bookstore-owner/](https://leetcode.com/problems/grumpy-bookstore-owner/)
* [https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)
* [https://leetcode.com/problems/defuse-the-bomb/](https://leetcode.com/problems/defuse-the-bomb/)

---

# 🔹 5. Cycle Detection (Fast & Slow Pointer)

📌 Use when:

* Linked list cycle
* Duplicate detection

### Problems:

* [https://leetcode.com/problems/linked-list-cycle/](https://leetcode.com/problems/linked-list-cycle/)
* [https://leetcode.com/problems/linked-list-cycle-ii/](https://leetcode.com/problems/linked-list-cycle-ii/)
* [https://leetcode.com/problems/find-the-duplicate-number/](https://leetcode.com/problems/find-the-duplicate-number/)
* [https://leetcode.com/problems/happy-number/](https://leetcode.com/problems/happy-number/)
* [https://leetcode.com/problems/middle-of-the-linked-list/](https://leetcode.com/problems/middle-of-the-linked-list/)
* [https://leetcode.com/problems/circular-array-loop/](https://leetcode.com/problems/circular-array-loop/)
* [https://leetcode.com/problems/remove-nth-node-from-end-of-list/](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
* [https://leetcode.com/problems/palindrome-linked-list/](https://leetcode.com/problems/palindrome-linked-list/)
* [https://leetcode.com/problems/intersection-of-two-linked-lists/](https://leetcode.com/problems/intersection-of-two-linked-lists/)

---

# 🔹 6. Partitioning (Dutch National Flag)

📌 Use when:

* Rearranging elements
* Pivot logic

### Problems:

* [https://leetcode.com/problems/sort-colors/](https://leetcode.com/problems/sort-colors/)
* [https://leetcode.com/problems/partition-labels/](https://leetcode.com/problems/partition-labels/)
* [https://leetcode.com/problems/wiggle-sort/](https://leetcode.com/problems/wiggle-sort/)
* [https://leetcode.com/problems/wiggle-sort-ii/](https://leetcode.com/problems/wiggle-sort-ii/)
* [https://leetcode.com/problems/partition-array-according-to-given-pivot/](https://leetcode.com/problems/partition-array-according-to-given-pivot/)
* [https://leetcode.com/problems/rearrange-array-elements-by-sign/](https://leetcode.com/problems/rearrange-array-elements-by-sign/)
* [https://leetcode.com/problems/separate-black-and-white-balls/](https://leetcode.com/problems/separate-black-and-white-balls/)
* [https://leetcode.com/problems/sort-array-by-increasing-frequency/](https://leetcode.com/problems/sort-array-by-increasing-frequency/)

---

# 🔹 7. Three Pointer

📌 Use when:

* Triplets / combinations

### Problems:

* [https://leetcode.com/problems/3sum/](https://leetcode.com/problems/3sum/)
* [https://leetcode.com/problems/3sum-closest/](https://leetcode.com/problems/3sum-closest/)
* [https://leetcode.com/problems/4sum/](https://leetcode.com/problems/4sum/)
* [https://leetcode.com/problems/valid-triangle-number/](https://leetcode.com/problems/valid-triangle-number/)
* [https://leetcode.com/problems/increasing-triplet-subsequence/](https://leetcode.com/problems/increasing-triplet-subsequence/)
* [https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/](https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/)
* [https://leetcode.com/problems/sum-of-square-numbers/](https://leetcode.com/problems/sum-of-square-numbers/)

---

# 🔹 8. Merge Style (Two Sorted Arrays)

📌 Use when:

* Two sorted inputs

### Problems:

* [https://leetcode.com/problems/merge-two-sorted-lists/](https://leetcode.com/problems/merge-two-sorted-lists/)
* [https://leetcode.com/problems/merge-sorted-array/](https://leetcode.com/problems/merge-sorted-array/)
* [https://leetcode.com/problems/intersection-of-two-arrays-ii/](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
* [https://leetcode.com/problems/squares-of-a-sorted-array/](https://leetcode.com/problems/squares-of-a-sorted-array/)
* [https://leetcode.com/problems/median-of-two-sorted-arrays/](https://leetcode.com/problems/median-of-two-sorted-arrays/)
* [https://leetcode.com/problems/find-k-pairs-with-smallest-sums/](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/)
* [https://leetcode.com/problems/merge-k-sorted-lists/](https://leetcode.com/problems/merge-k-sorted-lists/)

---

# 🔹 9. Expand Around Center (Palindrome)

📌 Use when:

* Palindromes

### Problems:

* [https://leetcode.com/problems/longest-palindromic-substring/](https://leetcode.com/problems/longest-palindromic-substring/)
* [https://leetcode.com/problems/palindromic-substrings/](https://leetcode.com/problems/palindromic-substrings/)
* [https://leetcode.com/problems/valid-palindrome-ii/](https://leetcode.com/problems/valid-palindrome-ii/)
* [https://leetcode.com/problems/shortest-palindrome/](https://leetcode.com/problems/shortest-palindrome/)
* [https://leetcode.com/problems/break-a-palindrome/](https://leetcode.com/problems/break-a-palindrome/)
* [https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/)
* [https://leetcode.com/problems/palindrome-partitioning/](https://leetcode.com/problems/palindrome-partitioning/)

---

