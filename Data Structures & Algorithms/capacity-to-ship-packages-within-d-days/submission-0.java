class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = 0;
        for (int i = 0; i < weights.length; i++)
        {
            if(weights[i] > low)
            low = weights[i];
            high += weights[i];
        }
        return Binsearch (weights, low, high, days);
    }
        int Binsearch(int[] arr, int low, int high, int days)
        {
            if(low > high)
            return low;
            int mid = (high + low) / 2;
            int count_days = count_days(arr, mid);
            if (count_days <= days)
            return Binsearch(arr, low, mid-1, days);
            else
            return Binsearch(arr, mid+1, high, days);
        }
        int count_days(int[] arr, int mid)
        {
            int days = 1;
            int load = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(load + arr[i] > mid)
                {
                    days++;
                    load = arr[i];
                }
                else
                load = load + arr[i];
            }
            return days;
        }
    }