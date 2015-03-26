/*
author: qwan@cs.wisc.edu

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

*/

import java.util.HashMap;

package Leetcode.Solutions;

public class P1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] re = new int[2];
         HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
         for (int i = 0;i<numbers.length;i++)
         {
             if (hm.containsKey(numbers[i]))
             {
                 re[0] = hm.get(numbers[i]) + 1;
                 re[1] = i + 1; 
                 break;
             }
             
             hm.put(target-numbers[i],i);
         }
         
         return re;
    }
}