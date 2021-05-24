import java.util.*;

class RangeSum {
    int[] n;
    public RangeSum(int[] nums) {
    n=nums;
    }

    public int total(int i, int j) {
        int t=0;
        for(int index=i;index<j && index<n.length;index++){
            t+=n[index];

        }
        return t;
    }
}