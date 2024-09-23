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
    ListNode removeZero(ListNode head){
        ListNode save = head;
        ListNode prev = null;
        while(head != null){
            if(head.val == 0){
                if(prev == null ){
                    save = head.next;
                }else{
                    prev.next = head.next;
                }
            }else{
                prev = head;
            }
            head = head.next;
        }
        return save;
    }
    void printer(ListNode head){
        while(head != null ){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    boolean flag = false;
    ListNode reducer(ListNode head , ListNode prev){
        flag = false;
        ListNode save = head;
        int sum = 0;
        while(head!=null){
            sum += head.val;
            if(sum == 0){
                if(prev==null){
                    save = head.next;
                }else{
                    prev.next = head.next;
                }
                flag = true;
                return save;
            }
            head = head.next;
        }
        return save;
    }
    public ListNode removeZeroSumSublists(ListNode head) {
        head = removeZero(head);
        // printer(head);
        ListNode prev = null;
        ListNode save = head;
        while(head != null){
            ListNode n = reducer(head,prev);
           
            if(flag){
                if(prev == null){
                    save = n;
                    head = n;
                }else{
                    head = save;
                }
            }else{
                prev = head;
                head = head.next;
            }
        }
        return save;
    }
}