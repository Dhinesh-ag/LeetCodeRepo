class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<n;i++)
        {
            int tmp=nums[i];
            for(int j=i+1;j<n;j++)
            {
                if(tmp+nums[j]==target)
                {
                    arr[0]=j;
                    arr[1]=i;
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
        return arr;
        
    }
}