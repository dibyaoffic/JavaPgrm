import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileIOException {
    public static void main(String[] args) {
        try {
           // fileWritting();
            fileReading();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("i am Always executed");
        }
    }

    private static void fileWritting() throws IOException {
        FileWriter fw = new FileWriter("cricket.txt");
        PrintWriter out = new PrintWriter(fw);
        out.write(100);
        out.println(100);
        out.println(true);
        out.println('c');
        out.println("SaiCharan");
        out.flush();
        out.close();
    }

    public static void fileReading() throws IOException {
        
        File file = new File("cricket.txt");
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line = bReader.readLine();

        if (line == null) {
            bReader.close();
            throw new DataNotFoundException("File is Empty!!");
        }

        while (line != null) {
            System.out.println(line);
            line = bReader.readLine();
        }

        bReader.close();
    }
}

class DataNotFoundException extends RuntimeException {

    String messageString;

    public DataNotFoundException(String string) {
        this.messageString = string;
        System.out.println(string);
    }
    

}
