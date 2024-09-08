class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] mainAns = new ListNode[k];
        if(head == null){
            return mainAns;
        }
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int mainLen = len;
        
        int dev = len/k;
        int rem = len % k;
        
        int ind = 0;
        for(int i = 0;i<k;i++){
            len = dev;
            if(rem > 0){
                len += 1;
                rem--;
            }
            ListNode ans = head;
            ListNode prev = null;
            if(ind < mainLen){
                while(len > 0){
                    prev = head;
                    if(head.next!= null){
                        head = head.next;
                    }
                    len--;
                    ind++;
                }
                prev.next = null;
                mainAns[i] = ans;
            }else{
                mainAns[i] = null;
            }
        }
        return mainAns;
    }
}