
interface InterfDemo {
    
    public final int i=11;
    
    public abstract void methodOne();

    public abstract void methodTwo();

    public static void staticMethod() {
        System.out.println("i'm static");
    }

    default void defaultMthod() {
        System.out.println("i'm default method");
    }
}

public class InnerClassesDemo {
    public static void main(String[] args) {

        InterfDemo interfDemo = new InterfDemo() {

            public void methodOne() {
                System.out.println("methodOne");
            }

            public void methodTwo() {
                System.out.println("MethodTWo");
            }
        };

        interfDemo.methodOne();
        interfDemo.methodTwo();

    }
}
