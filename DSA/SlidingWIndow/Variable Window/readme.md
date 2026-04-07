🔥 2. Variable Size Sliding Window (Expand & Shrink)
👉 Window size is dynamic
💡 When to use:
“Longest/Shortest subarray with condition”
Condition depends on sum / distinct / frequency


while (j < n) {
    // expand
    add(arr[j]);

    while (invalid condition) {
        remove(arr[i]);
        i++;
    }

    ans = max(ans, j - i + 1);
    j++;
}