🔹 9. Expand Around Center

👉 Used in strings

🧠 When to use:
Palindromes
🔥 Problems:
Longest Palindromic Substring


🧩 Template:
while (left >= 0 && right < n && s[left] == s[right]) {
    left--;
    right++;
}