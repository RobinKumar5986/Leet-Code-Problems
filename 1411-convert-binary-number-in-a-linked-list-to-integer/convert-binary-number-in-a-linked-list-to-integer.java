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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        int ans = 0;
        while(head != null){
            stk.push(head.val);
            head = head.next;
        }
        int pow = 0;
        while(!stk.isEmpty()){
            if(stk.pop() == 1){
                ans += Math.pow(2,pow);
            }
            pow++;
        }
        return ans;
    }
}