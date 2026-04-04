👉 Divide array into parts

🧠 When to use:
Sorting 0s, 1s, 2s
Pivot-based partition
🔥 Problems:
Sort Colors
QuickSort partition


🧩 Template:
int low = 0, mid = 0, high = n - 1;


while (mid <= high) {
    if (arr[mid] == 0) swap(low++, mid++);
    else if (arr[mid] == 1) mid++;
    else swap(mid, high--);
}