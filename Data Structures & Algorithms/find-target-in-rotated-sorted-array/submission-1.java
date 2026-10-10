class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return Binsearch(nums, 0, n-1, target);
    }

        int Binsearch (int[] arr, int low, int high, int target)
        {
            if(low > high)
            return -1;
            int mid = (low + high) / 2;
            if(arr[mid] == target)
            return mid;
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
