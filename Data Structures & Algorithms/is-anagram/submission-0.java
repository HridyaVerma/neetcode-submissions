

class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagrams must be the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Use HashMap instead of HashTree
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies of characters in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Decrement frequencies using string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            // If character in t isn't in s, it's not an anagram
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        // Check if all frequencies are zero
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}