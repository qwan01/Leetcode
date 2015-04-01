package Leetcode.Solutions;

public class P8 {
	public static void main(String[] args){
		P8 t = new P8();
		System.out.println(t.atoi("123"));
	}
	
	    public int atoi(String str) {
	        if (str.length() == 0) return 0;
	        
	        if (str.charAt(0) == '-')
	        {
	            return -1*patoi(str.substring(1));
	        }
	        else if(str.charAt(0) == '+')
	        {
	            return patoi(str.substring(1));
	        }
	        
	        return patoi(str);
	    }
	    
	    public int patoi(String str) {
	        
	        int a = 0;
	        int b = 0;
	        int i = 0;
	        
	        while (a>=b && i < str.length())
	        {
	            b = a;
	            a = a * 10 + str.charAt(i) - 48;
	            i++;
	        }
	        
	        if (a<b)
	        {
	            return 0;
	        }
	        else
	        {
	            return a;
	        }
	        
	    }
}
