import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);        list.add(2);        list.add(3);
        list.add(5);        list.add(4);        list.add(6);
        list.add(10);       list.add(12);       list.add(8);

        System.out.println(list);
        List<Integer> l2=list.stream()
                             .filter(i->i%2==0)
                             .map(i->i+2)
                             .sorted()
                             .collect(Collectors.toList());
        System.out.println(l2);
        
        Employee employee1=new Employee("dibya",100000d,1234);
        Employee employee2=new Employee("suriya",200000d,2345);
        Employee employee3=new Employee("banty",300000d,4567);
        

        ArrayList<Employee> employeelist=new ArrayList<>();
        employeelist.add(employee1);
        employeelist.add(employee2);
        employeelist.add(employee3);

        List<String> names = employeelist.stream()
                                         .map(employee->employee.getName())
                                         .collect(Collectors.toList());
        System.out.println(names);
    }
}
