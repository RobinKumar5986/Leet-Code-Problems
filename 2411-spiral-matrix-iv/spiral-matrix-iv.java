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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];
        for (int r = 0; r < m; r++) {
            Arrays.fill(mat[r], -1);
        }
        int c = 0;
        int loi = 0 , loj = 0 , hii = m-1 , hij = n-1;
        while(c<(m*n)){
            for(int i = loj ;i<= hij ;i++){
               
                if(head!=null){
                    mat[loi][i] = head.val;
                    head = head.next;
                }else{
                    return mat;
                }
                c++;
            }   
            
            loi++;
            for(int i = loi ;i <= hii;i++){
                if(head!=null){
                    mat[i][hij] = head.val;
                    head = head.next;
                }else{
                    return mat;
                }
                c++;
            }
            hij--;
            for(int i=hij;i>=loj;i--){
                if(head!=null){
                    mat[hii][i] = head.val;
                    head = head.next;
                }else{
                    return mat;
                }
                c++;
            }
            hii--;
            for(int i = hii; i>=loi ; i--){
                if(head!=null){
                    mat[i][loj] = head.val;
                    head = head.next;
                }else{
                    return mat;
                }
                c++;
            }
            loj++;
        }

        return mat;
    }
}