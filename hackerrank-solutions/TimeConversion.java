import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeConversion {
    public static void main(String[] args) {
      //  String s ="04:59:59AM";
        String s = "06:40:03AM";
        String s1 = s.substring(s.length()-2);
        String st1 = s.replace(s1, "");
        String[] st = st1.split(":");
        if(s1.equalsIgnoreCase("PM")){
           int hour = (Integer.parseInt(st[0])%12)+12;
          st[0] = st[0].replace(st[0], String.valueOf(hour));
        }
       if(s1.equalsIgnoreCase("AM")){
           Integer hour = Integer.parseInt(st[0]);
           if(hour.equals(12)) {
               st[0] = st[0].replace(st[0], "00");
           }

        }
        String s2 =  Stream.of(st).collect(Collectors.joining(":"));
        System.out.println(s2);
    }
}
