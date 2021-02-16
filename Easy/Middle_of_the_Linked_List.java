// https://leetcode.com/problems/middle-of-the-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode curr = new ListNode();
        curr = head;
        while(curr !=null)
        {
            size++;
            curr = curr.next;
        }
        System.out.println(size);
        size = size/2;
        System.out.println(size);
        int i = 0;
        curr = head;
        while(i<size)
        {
            curr = curr.next;
            i++;
        }
        return curr;
    }
}
