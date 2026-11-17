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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int groups = len / k;

        ListNode pass1 = head;
        ListNode pass2 = head;

        Stack<Integer> stk = new Stack<>();
        while(groups > 0) {
            for(int i = 0; i < k; i++){
                stk.push(pass1.val);
                pass1 = pass1.next;
            }
            for(int i = 0 ; i < k; i++) {
                pass2.val = stk.pop();
                pass2 = pass2.next;
            }
            groups--;
        }

        return head;
        
    }
}