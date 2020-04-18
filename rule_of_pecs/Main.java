
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //add(new ArrayList<String>());
        add(new ArrayList<Integer>());
        //add(new ArrayList<Exception>());
        add(new ArrayList<>());
        //add(new ArrayList<Object>());
    }

    private static void add(List<? extends Number> list) {
        // list.add(new Object());
        // list.add(1);
        for (Object number : list) {
            System.out.println(number);
        }
    }
}

