
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Handle edge case of null or empty input array
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // Map to group anagrams together: Key = Sorted String, Value = List of Anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Convert string to character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            
            // Convert sorted char array back to a String to use as a hash key
            String sortedKey = new String(charArray);
            
            // If the key doesn't exist, initialize a new list
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        
        // Return all grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
