import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode head) {
        int prev = head.val;
        head=head.next;
        while(head!=null){
            if(head.val<=prev){
                return false;
            }
            prev=head.val;
            head=head.next;

        }
        return true;
    }

}