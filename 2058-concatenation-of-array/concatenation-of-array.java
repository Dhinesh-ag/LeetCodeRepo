class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[]arr1=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i%nums.length];
            
        }
        return arr1;
        
    }
}