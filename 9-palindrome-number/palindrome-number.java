class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0))
        {
            return false;
        }
        int rev=0;
        int orginal=x;
        while(x!=0)
        {
            int pop=x%10;
            x/=10;
            rev=rev*10+pop;
        }
        return orginal==rev;
        
    }
}