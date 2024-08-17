class Solution {
    public String reverseWords(String s) {
        String[]rev=s.split("\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=rev.length-1;i>=0;i--)
        {
            sb.append(rev[i]+" ");
        }
        return sb.toString().trim();
        
    }
}