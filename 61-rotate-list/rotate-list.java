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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        List<ListNode> lst = new ArrayList<>();

        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            lst.add(temp);
            temp = temp.next;
        }
        k = k % len;
        if( k == 0 ) return head;
        if( len == 1 ) return head;


        int ind = len - k;
        ListNode ans = lst.get(ind);
        ListNode newLast = lst.get(ind - 1);
        ListNode actualLast = lst.get(len-1);
        ListNode actualStart = lst.get(0);

        newLast.next = null;
        actualLast.next = actualStart;


        return ans;

    }
}