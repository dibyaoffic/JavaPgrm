import java.util.*;
import java.util.HashMap;
import java.util.Map.*;

public class Interview{
  
  public static void main(String[] args) {
    double d=Math.random();
    System.out.println(d);
    Map<Integer,String> m=new HashMap<>();
    m.put(2,"hii");
    m.put(3, "hell0");
    Set<Entry<Integer,String>> st=m.entrySet();
    for (Entry<Integer,String> var : st) {
      System.out.println(var.getKey());
    }
  }
}