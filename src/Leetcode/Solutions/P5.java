package Leetcode.Solutions;

public class P5 {
	    public String longestPalindrome(String s) {
	        boolean[][] array = new boolean[1000][1000];
	        int max = 1;
	        int begin = 0;
	        int end = 0;
	        
	        if (s.length()==1)
	        {
	            return s;
	        }

	        for (int i=0;i<s.length()-1;i++)
	        {
	            array[i][i] = true;
	            if (s.charAt(i)==s.charAt(i+1))
	            {
	                array[i][i+1] = true;
	                max = 2;
	                begin = i;
	                end = i+1;
	            }
	        }
	        
	        array[s.length()-1][s.length()-1] = true;

	        if (s.length()==2 && max == 2)
	        {
	            return s;
	        }
	        
	        for (int i=2;i<s.length();i++)
	        {
	            for (int j=0;i+j<s.length();j++)
	            {
	                if (array[j+1][i+j-1] && s.charAt(j)==s.charAt(i+j))
	                {
	                    array[j][i+j] = true;
	                    if (i+1>max)
	                    {
	                        max = i+1;
	                        begin = j;
	                        end = i+j;
	                    }
	                }
	            }
	        }
	        
	        return s.substring(begin,end+1);
	    }
}
