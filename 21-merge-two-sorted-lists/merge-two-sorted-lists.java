class Solution {
    public ListNode mergeTwoLists(ListNode lst1, ListNode lst2) {
        ListNode ans = new ListNode();
        ListNode save = new ListNode();
        save.next = ans;
        while(lst1 != null && lst2 != null){
            if(lst1.val < lst2.val){
                ListNode node = new ListNode();
                node.val = lst1.val;
                ans.next = node;
                ans = ans.next;
                lst1 = lst1.next;
            }else{
                ListNode node = new ListNode();
                node.val = lst2.val;
                ans.next = node;
                ans = ans.next;
                lst2 = lst2.next;
            }
        }

        while(lst1 != null) {
            ListNode node = new ListNode();
            node.val = lst1.val;
            ans.next = node;
            ans = ans.next;
            lst1 = lst1.next;
        }
        while( lst2 != null ){
            ListNode node = new ListNode();
            node.val = lst2.val;
            ans.next = node;
            ans = ans.next;
            lst2 = lst2.next;
        }
        return save.next.next;
    }
}