// https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode temp = new ListNode();
        if(current==null || current.next == null)
            return current;
        
        
//         if(current.next!=null)
        temp.next = current.next;
       // current.next = current.next.next;
     
        if(current.next.next == null)
           {
               System.out.println("null");
               current.next = null;
           }
           else
           {
               current.next = current.next.next ;
               
           }
        temp.next.next = current;
        head = temp.next;
      
        // if(current.next==null || current.next.next==null)
        //     return head;
       while(true){ 
           if(current.next==null || current.next.next==null)
            break;
        temp.next = current.next;
            current.next = current.next.next;
           if(current.next.next == null)
           {
               temp.next.next = null;
           }
           else
           {
               temp.next.next = current.next.next;
               // current.next = current.next.next;
               
           }
         current.next.next = temp.next;
       
          current = current.next.next;   
       // if(current.next ==null)
       //     break; 
       }
    return head;    
    }
}
