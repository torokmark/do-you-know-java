
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        checkTryCatchFinally();
        checkTryWithResource();
        checkAutoClosable();
    }

    private static void checkTryCatchFinally() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new CharArrayReader("apple".toCharArray()));
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkTryWithResource() {
        try (BufferedReader br = new BufferedReader(new CharArrayReader("apple".toCharArray()))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkAutoClosable() {
        try (ClosableResource cr = new ClosableResource()) {
            // ...
        }
    }
}

