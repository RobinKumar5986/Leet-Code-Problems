class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        int len=0;
        ListNode save=head;
        while(head!=null){
            len++;
            head=head.next;
        }
        int mid=len/2;
        while(mid>0){
            save=save.next;
            mid--;
        }
        return save;
    }
}