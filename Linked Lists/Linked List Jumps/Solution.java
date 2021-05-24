import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {
        LLNode ptr=node;
        while(true){
            ptr.next=nextNode(ptr);
            if(ptr.next==null){
                break;
            }
                ptr=ptr.next;
        }
        return node;
    }
    private LLNode nextNode(LLNode ptr){
        int val=ptr.val;
        for(int i=0;i<val;++i){
            if(ptr==null){
                return null;
            }
            ptr=ptr.next;

        }
        return ptr;
    }
}