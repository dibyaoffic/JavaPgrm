import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamDemo{
    public static void main(String[] args) {
        int[] numbers={1,2,3,6,5,4,6,9,8,7};
        
        int min=IntStream.of(numbers)
                         .min()
                         .getAsInt();//it throws NoSuchElementException          
        System.out.println(min);
        System.out.println("-----------------------------------");
        IntStream.of(numbers)
                 .min()
                 .ifPresent(System.out::println);
        
        IntSummaryStatistics statistics =IntStream.of(numbers)
                                                  .summaryStatistics();
        statistics.getAverage();
        statistics.getCount();
        statistics.getMax();
        statistics.getCount();
        statistics.getSum();

        
    }
}