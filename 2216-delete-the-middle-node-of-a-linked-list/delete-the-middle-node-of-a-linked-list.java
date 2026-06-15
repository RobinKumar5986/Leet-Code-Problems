
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null ){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev == null)
            return null;
        prev.next = slow.next;
        return head;
    }
}