class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode save = ans;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ListNode n = new ListNode(l1.val);
                ans.next = n;
                ans = ans.next;
                l1 = l1.next;
            }else{
                ListNode n = new ListNode(l2.val);
                ans.next = n;
                ans = ans.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            ListNode n = new ListNode(l1.val);
            ans.next = n;
            ans = ans.next;
            l1 = l1.next;
        }
        while(l2 != null ){
            ListNode n = new ListNode(l2.val);
            ans.next = n;
            ans = ans.next;
            l2 = l2.next;
        }
        return save.next;
    }
}