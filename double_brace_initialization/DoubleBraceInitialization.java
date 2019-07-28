
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class DoubleBraceInitialization {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<Integer>() {{
      add(1);
      add(2);
    }};

    Map<String, Integer> map = new HashMap<String, Integer>() {{
      put("apple", 2);
      put("blueberry", 5);
      put("melon", 5);
    }};
  }
}
