class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<nums.length;i++)
        {
            cur=nums[i]+cur;
            if(cur>max)
            {
                max=cur;
            }
            if(cur<0)
            {
                cur=0;
            }
        }
        return max;
        

    }
}