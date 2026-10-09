class Solution {
public int[] sortArray(int[] nums) {
int n = nums.length - 1;
QuickSortRecursion(nums, 0, n);
return nums;
}
int partition(int[] arr, int low, int high) {
    int pivot = arr[low + (high - low) / 2];

    while (low <= high) {
        while (arr[low] < pivot)
            low++;

        while (arr[high] > pivot)
            high--;

        if (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    return low;
}
void QuickSortRecursion(int[] arr, int low, int high) {
    if (low >= high)
        return;

    int pi = partition(arr, low, high);

    if (low < pi - 1)
        QuickSortRecursion(arr, low, pi - 1);

    if (pi < high)
        QuickSortRecursion(arr, pi, high);
}
}
