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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode temp = head;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        Stack<Integer> stk = new Stack<>();

        int max = 0;
        int hf = n/2;
        for(int i = 0 ; i < n ;i++){
            if(i < hf){
                stk.push(head.val);
            }else{
                int sum = stk.pop() + head.val;
                max = Math.max(sum,max);
            }
            head = head.next;
        }
        return max;

    }
}