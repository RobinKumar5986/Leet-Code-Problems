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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode cur=head;
        ListNode next=cur;
        while(next!=null){
            if(cur.val==next.val){
                if(next.next!=null){
                    System.out.println(next.next.val + " exit ");
                    cur.next=next.next;
                    next=next.next;
                }else{
                    cur.next=null;
                    next=null;
                }
            }else{
                cur=cur.next;
                next=next.next;
            }
            
        }
        return head; 
    }
}