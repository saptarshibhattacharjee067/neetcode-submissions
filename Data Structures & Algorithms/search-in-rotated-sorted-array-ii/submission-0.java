class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length-1;
        return Binsearch(nums, 0, n, target);        
    }
    boolean Binsearch(int[] arr, int low, int high, int target)
    {
        if(low > high)
        return false;
        int mid = (low + high) / 2;
        if(target == arr[mid])
        return true;
        if(arr[low] == arr[mid] && arr[mid] == arr[high])
        return Binsearch(arr, low+1, high-1, target);
        if(arr[low] <= arr[mid])
        {
            if(target >= arr[low] && target < arr[mid])
            return Binsearch(arr, low, mid-1, target);
            else
            return Binsearch(arr, mid+1, high, target);
        }
        else
        {
            if(target > arr[mid] && target <= arr[high])
            return Binsearch(arr, mid+1, high, target);
            else
            return Binsearch(arr, low, mid-1, target);
        }
    }
}