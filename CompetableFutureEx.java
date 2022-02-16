import java.util.concurrent.CompletableFuture;

public class CompetableFutureEx {
    static int i;

    public static int compute() {
        System.out.println("compute" + Thread.currentThread() + i);
        return 2;
    }

    public static void printIt(int value) {
        System.out.println("PrintIt :" + Thread.currentThread());
        System.out.println(value);
    }

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> compute());
    }

    public static void main(String[] args) {
        System.out.println("main :" + Thread.currentThread());
        CompletableFuture<Integer> cFuture = create();

        sleep(1000);
        cFuture.thenAccept(data -> printIt(data));

        sleep(1000);
    }

    private static boolean sleep(int i) {
        try {
            Thread.sleep(i);
            return true;
        } catch (InterruptedException exception) {
            return false;
        }
    }

}
