import java.util.*;

public class Test {
  public static void main(String[] args) {

    List<Integer> list=Arrays.asList(1,2,3,4,5,6);
    Map<Integer,Integer> map=new HashMap<>();
    map.put(null, null);
    map.put(1, 2);
    System.out.println(map);

    Set<Integer> set=new HashSet<Integer>();
    set.add(null);
    set.add(2);
    set.add(null);
    System.out.println(set);

    System.out.println("----------------------------");
    list.stream()
        .filter(i->i%2==0)
        .map(i->i+2)
		    .map(i->i*2)	
        .forEach(System.out::println);
    System.out.println("-----------------------------");
    int i=10;
    while (i--> 0) {
      System.out.print(i);
    }
    
  }
}

