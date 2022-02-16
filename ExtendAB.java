public class ExtendAB {
    public static void main(String[] args) {
        A a=new B();
        a.run();
    }

}
class A{
    void walk(){
        System.out.println("a:walk");
    }
    void run(){
        System.out.println("a:run");
        walk();
    }
}
class B extends A{
    void walk(){
        System.out.println("b:walk");
    }
    void run(){
        System.out.println("b:run");
       // super() it should be the 1st line of a contructor.
    }
}