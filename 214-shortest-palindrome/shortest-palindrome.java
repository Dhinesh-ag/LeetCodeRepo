class Solution
 {
    public String shortestPalindrome(String s)
     {
        int n = s.length();
        String reversed = new StringBuilder(s).reverse().toString();
        for (int i = n; i >= 0; i--) {
            if (s.substring(0, i).equals(reversed.substring(n - i))) {
                return reversed.substring(0, n - i) + s;
            }
        }
        
        return " ";  
    }
}