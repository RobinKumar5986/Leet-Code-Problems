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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        ListNode prev = null;
        ListNode ans = null;
        while(head != null){
            if(set.contains(head.val)){
                while(head != null && set.contains(head.val)){
                    head = head.next;
                }
            }
            if(prev == null){
                prev = head;
            }else{
                prev.next = head;
                prev = head;
            }
            if(head != null)
                head = head.next;
            if(ans == null)
                ans = prev;

        }
        return ans;
    }
}