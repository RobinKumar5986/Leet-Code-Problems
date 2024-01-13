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
        int rem=0;
        ListNode ans=new ListNode(0);
        ListNode save=ans;
        while(l1!=null && l2!=null){
            int v1=l1.val;
            int v2=l2.val;
            int sum=l1.val+l2.val+rem;
            rem=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=temp;

            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int v1=l1.val;
            int sum=l1.val+rem;
            rem=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=temp;

            l1=l1.next;
        }
        while(l2!=null){
            int v2=l2.val;
            int sum=l2.val+rem;
            rem=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=temp;

            l2=l2.next;
        }
        if(rem!=0){
            ListNode temp=new ListNode(rem);
            ans.next=temp;
            ans=temp;
        }
        return save.next;
    }
}