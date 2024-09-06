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
        ListNode save = new ListNode(0);
        ListNode ans = new ListNode(0);
        save.next = ans;
        while(head!=null){
            if(!set.contains(head.val)){
               ListNode node = new ListNode(head.val);
               ans.next = node;
               ans = ans.next;
            }
            head = head.next;
        }
        return save.next.next;
    }
}