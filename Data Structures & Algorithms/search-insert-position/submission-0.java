class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        return Binarysearch(nums, 0, n-1, target);
    }
    int Binarysearch(int[] arr, int low, int high, int target)
    {
        int mid = (low + high) / 2;
        if(low > high)
        return low;
        if (arr[mid] == target)
        return mid;
        else if(arr[mid] < target)
        return Binarysearch(arr, mid+1, high, target);
        else
        return Binarysearch(arr, low, mid-1, target);
    }
}