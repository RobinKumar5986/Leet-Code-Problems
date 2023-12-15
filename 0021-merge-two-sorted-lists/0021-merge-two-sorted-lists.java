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
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode node=null;
        ListNode prev=null;
        ListNode head=null;
        while(list1!=null && list2!=null){
            int v1=list1.val;
            int v2=list2.val;
            ListNode s1=list1.next;
            ListNode s2=list2.next;
            if(node==null){
                if(v1<=v2){
                    head=list1;
                    node=list1;

                    list1=s1;
                }else{
                    head=list2;
                    node=list2;

                    list2=s2;
                }
            }else{
                int v3=node.val;
                if(v1<=v2){
                    if(v1<=v3){
                        node.val=v1;
                        node.next=list1;
                        node=list1;
                        list1=s1;
                    }else{
                        node.next=list1;
                        node=list1;
                        list1=s1;
                    }
                }else{
                    if(v2<=v3){
                        node.val=v2;
                        node.next=list2;
                        node=list2;

                        list2=s2;
                    }else{
                        node.next=list2;
                        node=list2;

                        list2=s2;

                    }
                }
            }
     
        }
        while(list1!=null ){
            int v1=list1.val;
            int v2=node.val;
            if(v1<=v2)
                node.val=v1;
            else
                node.val=v2;
            
            node.next=list1;
            node=list1;
            list1=list1.next;  
        }
        while(list2!=null){
            int v1=list2.val;
            int v2=node.val;
            if(v1<=v2)
                node.val=v1;
            else
                node.val=v2;
            
            node.next=list2;
            node=list2;
            list2=list2.next;

        }
    
        return head;
    }
}