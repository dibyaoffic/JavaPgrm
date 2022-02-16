
import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        
     List<Integer> aList = Arrays.asList(1,2,3,4,5,6);
    // aList.forEach(i -> System.out.println(i));

     System.out.println(aList.stream()
                             .filter(i -> i%2==0)
                             .map(i ->i*2)
                             .reduce(0,(c,e)-> c+e));
                             
     /* System.out.println(aList.stream()
                             .filter(i -> i%2==0)
                             .reduce(Integer::sum)); */
     System.out.println(aList.stream()
                             .filter(i -> i%2==0)//lazy method
                             .map(i ->i*2)//lazy method
                             .findFirst()//terminal function
                             .orElse(0));
    }
}
