class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        return Binarysearch(nums, low, high, target);
    }

    int Binarysearch(int[] nums, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (nums[mid] == target)
            return mid;

        else if (nums[mid] < target)
            return Binarysearch(nums, mid + 1, high, target);

        else
            return Binarysearch(nums, low, mid - 1, target);
    }
}