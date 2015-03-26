package Leetcode.Solutions;

import java.util.HashMap;

public class P3 {
	public static void main(String[] args)
	{
		String s = "eeedfs";
		System.out.println(lengthOfLongestSubstring(s));
	}
/*	
    static public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>(); 
        int start = 0;
        int end = 0;
        int max = 1;
        hs.put(s.charAt(start), start);
    	for (int i=1;i<s.length();i++)
        {
        	char c = s.charAt(i);
        	if (hs.containsKey(c))
        	{
        		int temp = hs.get(c);
        		
        		for (int j=start;j<hs.get(c);j++)
        		{
        			hs.remove(s.charAt(j));        			
        		}
        		start = temp+1;        		
        	}
        	else
        	{
            	hs.put(c, i);        		
        	}
        	end = i;
    		if (end - start + 1 > max)
    		{
    			max = end - start;
    		}        	
        }
    	
    return max;	
    }
    */
		
    static public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>(); 
        int longest = 0;
        int left = 0 ;
    	for (int i=0;i<s.length();i++)
    	{
    		int last = hs.containsKey(s.charAt(i)) ? hs.get(s.charAt(i))+1:-1;
    		left = Math.max(last, left);
    		hs.put(s.charAt(i), i);
    		longest = Math.max(longest, i-left+1);
    	}
    	return longest;
    }
}
