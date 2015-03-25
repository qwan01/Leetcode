/*
author: qwan@cs.wisc.edu

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

*/

package Leetcode.Solutions;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        
        while (t1.next != null || t2.next != null)
        {
            
            t1.val = t2.val + t1.val + overflow;
            if (t1.val > 9)
            {
                overflow = 1;
                t1.val -= 10;
            }
            else
            {
                overflow = 0;
            }
            
            if (t1.next == null )
            {
                t1.next = new ListNode(0);
            }
            
            if (t2.next == null )
            {
                t2.next = new ListNode(0);
            }
            
            t1 = t1.next;
            t2 = t2.next;
        }
        
            t1.val = t2.val + t1.val + overflow;
            if (t1.val > 9)
            {
                overflow = 1;
                t1.val -= 10;
            }
            else
            {
                overflow = 0;
            }
            
            if (overflow != 0)
            {
                t1.next = new ListNode(1);
            }
        
        return l1;
    }
}
