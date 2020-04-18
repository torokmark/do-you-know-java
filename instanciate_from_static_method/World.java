public class World extends Hello {
    @Override
    public void start() {
        System.out.println("in the world!");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

