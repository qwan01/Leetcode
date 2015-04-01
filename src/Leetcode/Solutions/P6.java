package Leetcode.Solutions;

public class P6 {
	    public String convert(String s, int nRows) {
	        int step = (nRows-1)*2;
	        if (step == 0)
	        return s;
	        
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0;i<s.length();i+= step)
	        {
	            sb.append(s.charAt(i));
	        }
	        
	        for (int j = 1;j<nRows-1;j++)
	        {
	            for (int i = j;i<s.length();i+= step)
	                {
	                    sb.append(s.charAt(i));
	                    if(i+(step) - 2*j < s.length())
	                        sb.append(s.charAt(i+(step) - 2*j));
	                }
	        }
	        
	        for (int i = nRows-1;i<s.length();i+= step)
	        {
	            sb.append(s.charAt(i));
	        }
	        
	        return sb.toString();
	    }
}
