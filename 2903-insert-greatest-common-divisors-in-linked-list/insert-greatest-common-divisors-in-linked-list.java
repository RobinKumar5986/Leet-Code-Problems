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
    public int gcd(int a, int b){
        if(a == 1 || b==1){
            return 1;
        }
        while(b !=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode next = head.next;
        while(next!=null){
            int gcd = gcd(cur.val , next.val);
            ListNode n = new ListNode(gcd);
            cur.next = n;
            n.next = next;

            cur = next;
            next = next.next;
        }
        return head;
    }
}