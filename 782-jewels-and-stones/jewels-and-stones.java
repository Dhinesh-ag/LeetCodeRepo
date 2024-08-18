class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int n=stones.length();
        int j=jewels.length();
        int r=0;
        for(int i=0;i<j;i++)
        {
            int count=0;
            char ch=jewels.charAt(i);
            for(int k=0;k<n;k++)
            {
              if(ch==stones.charAt(k))
              {
                count++;
              }
            }
            r=r+count;
        }
        return r;  
    }
}