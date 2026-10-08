class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length-1; j++)
            {
                int left = j+1;
                int right = nums.length-1;
                while(left < right)
                {
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum > target)
                    {
                        right--;
                    }
                    else if(sum < target)
                    {
                        left++;
                    }
                    else
                    {
                        List<Integer> tempresult = new ArrayList<>();
                        tempresult.add(nums[i]);
                        tempresult.add(nums[j]);
                        tempresult.add(nums[left]);
                        tempresult.add(nums[right]);
                        hs.add(tempresult);
                        left++;
                        right--;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(hs);
        return ans;
    }
}