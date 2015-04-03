package Leetcode.Solutions;

import java.util.HashMap;
import java.util.LinkedList;


public class P10 {
    
	public static void main(String[] args){
		String s="a";
		String p="ab*a";
		System.out.println(new P10().isMatch(s,p));
	}
	
	public boolean isMatch(String s, String p) {
		return isMatchR(s+"_",p+"_",0,0);        
    }
	
	public boolean isMatchR(String s, String p , int pi, int si)
	{
		if (pi == p.length() && si == s.length())
		{
			return true;
		}
		else if (pi == p.length())
		{
			return false;
		}
		else if (si == s.length())
		{							
			return false;			
		}
		
		char current = s.charAt(si);
		char pattern = p.charAt(pi);
		
		if (pattern == '*')
		{
			char prev = p.charAt(pi-1);
			
			if (!isMatchR(s, p , pi+1, si))
			{
				if (prev == current || prev == '.'){
					return isMatchR(s, p , pi, si+1) || isMatchR(s, p , pi+1, si+1);
				}
				else
				{
					return false;
				}				
			}
			else
			{
				return true;
			}
			
		}
		else
		{
			if (pi < p.length()-1)
			{
				if (p.charAt(pi+1)=='*')
				{
					if (isMatchR(s, p , pi+2, si))
						return true;
				}
			}
			
			if (pattern == current || pattern == '.'){
				return isMatchR(s, p , pi+1, si+1);
			}
			else
			{				
				return false;
			}
		}		
		
	}
}
