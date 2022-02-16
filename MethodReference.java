import java.util.Arrays;
import java.util.List;


public class MethodReference {
    
    public static void m1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("child method m1");
        }
    }

    public  void m2(int id){
        for (int i = 0; i < 5; i++) {
            id=id+i;
            System.out.println("child method m2 "+id);
        }
    }

    public static void sum(int i,int j){
        System.out.println("sum of two no "+(i+j));
    }
    
    public static void main(String[] args) {

        Runnable runnable=MethodReference::m1;
        Thread thread = new Thread(runnable);
        thread.start();
        
        MethodReference mr=new MethodReference();
        Runnable runnable2 = () -> mr.m2(1);
        Thread thread2=new Thread(runnable2);
        thread2.start();
        
        Interf1 interf=MethodReference::sum;
        interf.add(2, 5); 

        List<Integer> list=Arrays.asList(1,6,3,4,5,2,10,8,12); 
        list.stream()
            .sorted()
            .filter(i->i%2==0)
            .map(i->i+2)
            .forEach(System.out::println);
      }   
}
interface Interf1{
    public void add(int a,int b);
}