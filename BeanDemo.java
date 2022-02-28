import java.util.Scanner;

class Employee{
    private String name;
    private double balance;
    private int pass;
    
    
    public Employee() {
    }

    public Employee(String name, double balance, int pass) {
        this.name = name;
        this.balance = balance;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getBalance(int pass) {
        if(this.pass==pass)
            return balance;
        else
            System.out.println("pin don't match");
        return 0;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPass(int pin) {
        this.pass = pin;
    }
}


class Bank{
    public Employee geteEmployee(){
        Employee employee=new Employee();
        employee.setBalance(100000.00);
        employee.setPass(1341);
        employee.setName("Gudu");
        return employee;
    }
} 

public class BeanDemo {
    public static void main(String[] args) {
        Bank bank= new Bank();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter pin");
        int pin=sc.nextInt();
        System.out.println(bank.geteEmployee().getName()+" "
                            +bank.geteEmployee().getBalance(pin));
        sc.close();
    }
}
