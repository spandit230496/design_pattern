1. Fixed Size Sliding Window
👉 Window size = constant (k)
💡 When to use:
“Find max/min/sum of subarray of size k”
Window length is given



int i = 0, j = 0;
int sum = 0;

while (j < n) {
    sum += arr[j];

    if (j - i + 1 == k) {
        // process window
        sum -= arr[i];
        i++;
    }
    j++;
}