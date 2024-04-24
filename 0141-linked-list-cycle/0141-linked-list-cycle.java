public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        // ListNode fast=head;
        // ListNode slow=head;
        // while(fast.next!=null && fast.next.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(fast==slow)
        //         return true;
        // }
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head))
                return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
}