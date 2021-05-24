import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        LLNode ptr=node;
        int len=0;
        while(ptr!=null){
            ptr=ptr.next;
            ++len;
        }
        int x=len-1;
        ptr=node;
        int sum=0;
        for(int i=len-1;i>=0;--i){
            sum+=ptr.val*Math.pow(2,i);
            ptr=ptr.next;
        }
        return sum;
    }
}