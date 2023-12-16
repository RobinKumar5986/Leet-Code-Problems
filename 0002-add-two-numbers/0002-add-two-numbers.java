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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        ListNode ans=new ListNode(0);
        ListNode head=ans;
        
        int rem=0;
        while(l1!=null && l2!=null){
            int v1=l1.val;
            int v2=l2.val;
            v1= v1 + v2 + rem;

            ListNode cur=new ListNode();
            rem=v1/10;
            cur.val=v1%10;

            ans.next=cur;
            ans=ans.next;

            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
          int v=l1.val;
          v += rem;
          ListNode cur=new ListNode();
          rem=v/10;
          cur.val=v%10;

          ans.next=cur;
          ans=ans.next;
          l1=l1.next;
        }
         while(l2!=null){
          int v=l2.val;
          v += rem;
          ListNode cur=new ListNode();
          rem=v/10;
          cur.val=v%10;

          ans.next=cur;
          ans=ans.next;
          l2=l2.next;
        }
        if(rem!=0){
            ListNode n=new ListNode(rem);
            ans.next=n;
            ans=n;
        }

        return head.next;

    }
}