import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(7,69, 2,221,8974);
        Collections.sort(arr);
        long max =0;
        long min =0;
        for(int i=1; i<arr.size(); i++){
            max+= arr.get(i);
        }
        for(int i=0; i<arr.size()-1; i++){
            min+= arr.get(i);
        }
        System.out.println(min +"\t"+ max);
    }
}
