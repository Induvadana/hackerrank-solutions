import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(7,8,6,3,2,4);
        Collections.sort(arr);
        int median =0;
        if((arr.size())%2 != 0){
          int mid = arr.size()/2;
            median = arr.get(mid);
        }else {
            int mid = arr.size()/2;
            median = (arr.get(mid-1) +arr.get(mid))/2;
        }
        System.out.println(median);
    }
}
