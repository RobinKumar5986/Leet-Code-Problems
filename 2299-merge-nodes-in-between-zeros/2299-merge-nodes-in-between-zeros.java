class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode save=new ListNode(0);
        ListNode nh=new ListNode(0);
        save=nh;
        while(head!=null){
            if(head.val==0 && sum!=0){
                ListNode node=new ListNode(sum);
                nh.next=node;
                nh=node;
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        return save.next;
    }
}