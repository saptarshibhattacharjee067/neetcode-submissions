class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int i = 0 ; i < piles.length; i++)
        {
            if(piles[i]>high)
            high = piles[i];
        }
        return Binsearch (piles, low, high, h);
    }
    int Binsearch (int[] arr, int low, int high, int h)
    {
        if(low > high)
        return low;
        int mid = (low + high) / 2;
        int th = Totalhours (arr, mid);
        if(th <= h)
        return Binsearch (arr, low, mid-1, h);
        else
        return Binsearch (arr, mid+1, high, h);
    }
    int Totalhours (int[] arr, int mid)
    {
        int th = 0;
        for(int i = 0; i < arr.length; i++)
        {
            th += (int) Math.ceil((double) arr[i] / mid);
        }
        return th;
    }
}
