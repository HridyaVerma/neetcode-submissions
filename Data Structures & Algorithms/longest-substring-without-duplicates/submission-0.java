class Solution {     
    public int lengthOfLongestSubstring(String s) {         
        int n=s.length();          
        int windowstart=0;         
        int windowend=0;         
        int maximum=0;          
        HashSet<Character> map=new HashSet<>();          
        for(int i=0;i<n;i++)         
        {             
            while(map.contains(s.charAt(i))){                                  
                map.remove(s.charAt(windowend)); // Remove the leftmost character                 
                windowend++;                     // Shrink the window from the left             
            }                            
            map.add(s.charAt(i));             
            windowstart++;             
            maximum=Math.max(maximum,windowstart-windowend);           
        }         
        return maximum;               
    } 
}

