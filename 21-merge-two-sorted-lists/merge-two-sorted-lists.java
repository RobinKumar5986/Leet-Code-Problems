class Solution {
    public ListNode mergeTwoLists(ListNode lst1, ListNode lst2) {
        ListNode ans = new ListNode();
        ListNode save = new ListNode();
        save.next = ans;
        while(lst1 != null && lst2 != null){
            if(lst1.val < lst2.val){
                ans.next = lst1;
                ans = ans.next;
                lst1 = lst1.next;
            }else{
                ans.next = lst2;
                ans = ans.next;
                lst2 = lst2.next;
            }
        }

        if(lst1 != null) {
            ans.next = lst1;
        }
        if( lst2 != null ){
            ans.next = lst2;
        }
        return save.next.next;
    }
}