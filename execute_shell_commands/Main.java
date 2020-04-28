
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProcessBuilder builder = new ProcessBuilder();
        builder.command("bash", "-c", "ping google.com");

        Process process;
        try {
            //process = builder.start();
            process = Runtime.getRuntime().exec("ping google.com");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                System.out.println(process.pid());
                System.out.println(process.isAlive());
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

//                System.out.println(process.children().count());
//                System.out.println(process.descendants().count());
//                process.destroy();
//                process.waitFor();
//                System.out.println(process.isAlive());
//                System.out.println(process.exitValue());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
