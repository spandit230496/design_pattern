🔥 4. Sliding Window with Count of Pairs / Contributions
👉 Count combinations inside window
💡 When to use:
“Count subarrays where condition holds”
Pair-based logic


long count = 0;
Map<Integer, Integer> freq = new HashMap<>();

while (j < n) {
    int f = freq.getOrDefault(arr[j], 0);
    count += f;  // pairs formed
    freq.put(arr[j], f + 1);

    while (count >= k) {
        // shrink
    }

    j++;
}