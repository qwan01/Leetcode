package Leetcode.Solutions;

public class P9 {
	    
	    public static boolean isPal(int x, int l)
	    {
	        if (x<0) return false;
	        if (x < 10) return true;
	        
	        if (x / (int)(Math.pow(10,l-1)) == (x % 10))
	        {
	            return isPal((x%(int)(Math.pow(10,l-1))) / 10);
	        }
	        
	        return false;
	    }
	    
	    public boolean isPalindrome(int x) {
	        if (x<0) return false;
	        if (x < 10) return true;
	        
	        return P9.isPal(x, int(Math.ceil(10,l-1)));
	    }
}
