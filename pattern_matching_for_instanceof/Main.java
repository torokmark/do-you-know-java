import java.util.List;
import java.util.Arrays;

class Main {
    private static final String s = "a";
    public static void main(String[] args) {
        Object o = "apple";


        if (o instanceof String s) {
            System.out.println(s);
        } else {
            System.out.println(s);
        }



        List<String> strings = Arrays.asList("jancsi", "julcsa");

        if (strings instanceof List<? extends Object> list) {
            System.out.println(list);
        }
    }
}

