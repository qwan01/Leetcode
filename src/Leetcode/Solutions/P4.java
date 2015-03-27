package Leetcode.Solutions;



public class P4 {
	
	public static void main(String[] args)
	{
		int[] a = {1};
		int[] b = {2,3,4,5,6};
		System.out.println(findMedianSortedArrays(a,b));
	}
	
    static public double findMedianSortedArrays(int A[], int B[]) {
    	if (A.length<B.length)
    	{
    		int[] tmp = A;
    		A = B;
    		B = tmp;
    	}
    	
    	if ((A.length + B.length)%2 == 1)
    	{
    		return findTopK(A, 0, B, 0, (A.length + B.length)/2 +1);
    	}
    	else
    	{
    		return (findTopK(A, 0, B, 0, (A.length + B.length)/2) + findTopK(A, 0, B, 0, (A.length + B.length)/2 +1))/2;
    	}        
    }
    
    static public double findTopK(int A[], int aBegin, int B[], int bBegin, int k)
    {
    	if(A.length == aBegin)
    	{
    		return B[bBegin+k-1];
    	}
    	else if (B.length ==bBegin)
    	{
    		return A[aBegin + k-1];
    	}
    	else if(k ==1)
    	{
        	return Math.min(A[aBegin], B[bBegin]);        	
    	}
    	else
    	{
    		int aNextBegin = Math.min(aBegin+ k - k/2-1, A.length-1);
    		int bNextBegin = Math.min(bBegin + k/2-1, B.length-1);
    		if (A[aNextBegin] == B[bNextBegin])
    		{
    			return A[aNextBegin];
    		}
    		else if(A[aNextBegin] < B[bNextBegin])
    		{
    			return findTopK(A, aNextBegin+1, B, bBegin, k - (aNextBegin - aBegin+1));
    		}
    		else 
    		{
    			return findTopK(A, aBegin, B, bNextBegin+1, k - (bNextBegin - bBegin+1));
    		}
    	}
    }
}