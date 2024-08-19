class Solution {
    public int singleNumber(int[] nums) 
    {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int k=0;k<nums.length;k++)
            {
                
                if(nums[i]==nums[k])
                {
                    count++;
                }
                
            }
            if(count==1)
                {
                    n=nums[i];
                }
        }
        return n;
        
    }
}