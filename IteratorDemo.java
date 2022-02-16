import java.util.*;
public class IteratorDemo {
   public static  void main(String [] args){
   
    ArrayList<Integer> l = new ArrayList<Integer>();
    
    for (int j=0; j<=10; j++) {
    l.add(j);
    }
   System.out.println(l);


   Iterator<Integer> iterator =l.iterator();
   
   while(iterator.hasNext()){
    Integer I=(Integer)iterator.next();
    if(I%2==0){
      System.out.println(I);
      //l.add(100); ConcurrentModificationException
    }
    else
      iterator.remove();
     }
   }
}
