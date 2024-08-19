class Solution {
    public String mergeAlternately(String word1, String word2) {
        char ch[]=word1.toCharArray();
        char ch1[]=word2.toCharArray();
        String str="";
        int x=word1.length()+word2.length();
        int a=word1.length();
        int b=word2.length();
        int i=0;
        while(i<x)
        {
            if(i<a)
            {
                str=str+ch[i];
            }
            if(i<b)
            {
                str=str+ch1[i];
            }
            i++;
        }
        return str;
        
    }
}