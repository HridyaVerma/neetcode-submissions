class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Move the left pointer forward if it's not a letter or a digit
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } 
            // Move the right pointer backward if it's not a letter or a digit
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } 
            // Compare characters ignoring their case
            else {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}
