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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2; //edge case
        if(list2==null) return list1;

        ListNode node=new ListNode();
        ListNode head=null;
        boolean flag=true;
    
        while(list1!=null && list2!=null){
           if(list1.val<=list2.val){
               if(flag)
                  head=list1;
                flag=false;

               node.next=list1;
               list1=list1.next;
           }else{
               if(flag)
                  head=list2;
                flag=false;

               node.next=list2;
               list2=list2.next;
           }
           node=node.next;
        }
        if(list1!=null){
            node.next=list1;
        }
        if(list2!=null){
            node.next=list2;
        }
    
        return head;
    }
}