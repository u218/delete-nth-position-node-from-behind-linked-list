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
    public ListNode removeNthFromEnd(ListNode head, int n) {

    
         ListNode curr = head;
        
        if(head==null)
        {
            return null;
        }
        int size = 0;
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        size = size-n;
        ListNode pre =head;
        int i = 1;
        
        while(i<size)
        {
            pre =pre.next;
            i++;
        }
        pre.next=pre.next.next;
        return head;

    }
    
}
