import java.util.ArrayList;
import java.util.function.Predicate;

public class NullableJava8 {

    NullableJava8(){
        
    }
    public static void main(String[] args) {
        
        String[] name={"durga","",null,"ravi","","Shiva",null};
        
        Predicate<String> p = s -> s!=null && s.length()!=0;
        ArrayList<String> list= new ArrayList<>();
        for(String s: name){
            if(p.test(s)){
                list.add(s);
            }
        }
        System.out.println("list after null check "+list);
    }
}
