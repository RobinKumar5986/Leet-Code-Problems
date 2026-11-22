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
        
        ListNode runner = new ListNode();
        ListNode ans = runner;
        int carry = 0;
        while(l1 != null && l2 != null){
            ListNode node = new ListNode();
            int n1 = l1.val;
            int n2 = l2.val;
            int sum = n1 + n2 + carry;
            int rem = sum%10;
            carry = sum/10;

            node.val = rem;
            runner.next = node;
            runner = node;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carry;
            ListNode node = new ListNode();
            int rem = sum % 10;
            carry = sum / 10;
            
            node.val = rem;
            runner.next = node;
            runner = node;
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            ListNode node = new ListNode();
            int rem = sum % 10;
            carry = sum / 10;
            
            node.val = rem;
            runner.next = node;
            runner = node;
            l2 = l2.next;
        }
        if(carry > 0){
            ListNode node = new ListNode();
            node.val = carry;
            runner.next = node;
        }

        return ans.next;
    }
}