class Solution {
    void display(ListNode head){
        while(head!=null){
            System.out.print(head.val+ " ");
            head=head.next;
        }
        System.out.println();
    }
    public void reorderList(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;
        //Getting the Midlle of the List
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //Reversing the List
        ListNode second=slow.next;
        ListNode prev=slow.next=null;

        while(second!=null){
            ListNode temp=second.next;
            second.next=prev;
            prev=second;
            second=temp;
        }
        second=prev;
        //Rearranging the List assignig
        ListNode first=head;
        while(second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;
            //Creatig Connection
            first.next=second;
            second.next=t1;
            //Mpving Ahade
            first=t1;
            second=t2;   
        }
    }
}
