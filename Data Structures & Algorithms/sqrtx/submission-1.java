class Solution {
    public int mySqrt(int x) {
        if(x < 2)
        return x;
        return sqrt (0, x, x);
    }
    int sqrt(int low, int high, int target)
    {
        int mid = (low + high) / 2;
        if(low > high)
        return high;
        if ((long) mid*mid == target)
        return mid;
        else if ((long) mid*mid > target)
        return sqrt (low, mid-1, target);
        else
        return sqrt(mid+1, high, target);
    }
}