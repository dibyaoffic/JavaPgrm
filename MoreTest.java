import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreTest {
    final static int i=19;
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int count = 9;
        //i=10; final variable can't reasign 
        System.out.println(i+10);//bt modify at runtime
        list.stream()
                .map( i -> i * count)
                .forEach(System.out::println);/*Local variable count defined in an enclosing 
                                                  scope must be final or effectively finalJava(536871575)*/

       // count=10;
       //System.out.println("😀");
        ArrayList<Integer> alist=new ArrayList<Integer>();

        alist.add(12);
        alist.add(13);
        //System.out.println(alist.get(3));

        Test1 t =Test1.getTest();
        System.out.println(t.hashCode());
        Test1 t2=Test1.getTest();
        System.out.println(t2.hashCode());
        }
}
abstract class Myabstclass{
    public void m1(){
        System.out.println("abstract");
    }
}

class Test1
{
       private static Test1 t=null;
       private Test1()
       {}
       public static Test1 getTest() {
             //getTest() method is a factory method
             if(t==null)
	{
	        t=new Test1();
  	}
              return t;
        }
}