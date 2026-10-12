class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq= new int[26];

        for(char a: s.toCharArray())
        {
            freq[a-'a']++;
        }

        for(char b:t.toCharArray())
        {
            freq[b-'a']--;
        }


        for(int f:freq)
        {
            if(f!=0)
            {
                return false;
            }
        }

        return true;

    }
}
