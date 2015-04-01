package Leetcode.Solutions;

public class P7 {
	    public int reverse(int x) {
	        int sign = 1;
	        if (x  < 0)
	        {
	            sign = -1;
	            x = -x;
	        }
	        
	        long sum = 0;

	        while(x > 0)
	        {
	            int tmp = x%10;
	            x = x/10;
	            sum = sum * 10 + tmp;
	        }
	        
	        if(sign == 1 && sum > Integer.MAX_VALUE)
	        {
	            return 0;
	        }
	        else if ((sign == -1)&& ((sum - 1) >  Integer.MAX_VALUE))
	        {
	            return 0;
	        }
	        
	        return (int)(sign * sum);
	    }
}
