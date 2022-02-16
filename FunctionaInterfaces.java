import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


@FunctionalInterface
interface Interf {
  public void add(int a, int b);

  static void info(){
    System.out.println("this is a Functional interface");
  } 

  default void details(){
    System.out.println("You can overide it by your own implemation");
  }
}

public class FunctionaInterfaces {

    public static void main(String[] args) {

        //Function<T,R> return R type 
        Function<Integer, Integer> f = i -> i * i;
        System.out.println("square of 4 " + f.apply(4));
    
        //Predicte<T>  return boolean
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(2));
        
        ///Consumer<T> return nothing(void)
        Consumer<String> consumer = s->System.out.println(s);
        consumer.accept("dibya");
    
        //Supplier<R> return R won't take any input
        Supplier<Date> supplier = ()->new Date();
        supplier.get();
    
        Interf i = (a, b) -> System.out.println("the sum of  is " + (a + b));
        i.add(2, 3); 
        
        Interf.info();
    }
}
