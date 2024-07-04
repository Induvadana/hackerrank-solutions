import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1);
        //below returns unique list
        //list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }
}
