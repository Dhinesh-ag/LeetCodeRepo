class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false;  // If the length is odd, it can't be valid

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println("Input: " + s1 + " Output: " + solution.isValid(s1)); // true
        System.out.println("Input: " + s2 + " Output: " + solution.isValid(s2)); // true
        System.out.println("Input: " + s3 + " Output: " + solution.isValid(s3)); // false
        System.out.println("Input: " + s4 + " Output: " + solution.isValid(s4)); // false
        System.out.println("Input: " + s5 + " Output: " + solution.isValid(s5)); // true
    }
}
