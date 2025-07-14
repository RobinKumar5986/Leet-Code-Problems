class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while(head != null ){
            ans = (ans << 1) | head.val;
            head = head.next;
        }
        return ans;
    }
}