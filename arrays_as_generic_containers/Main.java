
public class Main {
    public static void main(String[] args) {
        String fruit = "apple";
        Object tool = fruit;

        Object[] tools = {"hammer", "screwdriver"};
        String[] fruits = {"apple", "plum"};

        tools[1] = Integer.MAX_VALUE; // tools: type: Object[], value: {"hammer", Integer(1)}

        tools = fruits; // tools: type: String[], value: {"apple", "plum"}
        
        tools[1] = Integer.MAX_VALUE;
    
    }
}
