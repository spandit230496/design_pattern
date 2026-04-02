🔥 3. Sliding Window with Frequency Map / HashMap
👉 Track counts inside window
💡 When to use:
Distinct elements
Anagrams
Frequency-based problems


Map<Integer, Integer> freq = new HashMap<>();

while (j < n) {
    freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);

    while (condition) {
        freq.put(arr[i], freq.get(arr[i]) - 1);
        if (freq.get(arr[i]) == 0) freq.remove(arr[i]);
        i++;
    }

    j++;
}