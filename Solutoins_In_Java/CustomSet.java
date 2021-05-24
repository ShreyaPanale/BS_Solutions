import java.util.*;

class CustomSet {
    List<Integer> data;
    public CustomSet() {
        data=new ArrayList<>();
    }

    public void add(int val) {
        if(!data.contains(val))
        data.add(val);
    }

    public boolean exists(int val) {
        return data.contains(val);
    }

    public void remove(int val) {
        int i;
        for(i=0;i<data.size();i++){
            if(data.get(i)==val){
                data.remove(i);
                break;
            }
        }
    }
}