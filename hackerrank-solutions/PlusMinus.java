import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        float posCount =0.0f;
        float negCount = 0.0f;
        float zeroCount =0.0f;
        float len = arr.size();
        for(int i=0; i< arr.size(); i++){
            if(arr.get(i) > 0) {
                posCount ++;
            }
            if(arr.get(i) < 0) {
                negCount++;
            }
            if(arr.get(i) == 0) {
                zeroCount++;
            }
        }System.out.println(((float) posCount/len));
        System.out.println(((float) negCount/len));
        System.out.println(((float) zeroCount/len));
    }
}
