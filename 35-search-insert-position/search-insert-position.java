class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int ind=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]>=target)
            {
                break;
            }
        }
        return i;
    }
}