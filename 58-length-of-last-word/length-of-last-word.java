class Solution {
    public int lengthOfLastWord(String s) {
         String[] str=s.split(" ");
         String temp=str[str.length-1];
         return temp.length();


        
    }
}