import java.util.HashMap;

package Leetcode.Solutions;

public class Solution {
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