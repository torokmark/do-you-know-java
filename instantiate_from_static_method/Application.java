
import java.lang.reflect.InvocationTargetException;

public abstract class Application {
    private static int counter;

    public abstract void start();

    public static void launch(String[] args) {
        if (counter == 0) {
            counter += 1;
            String className = new Throwable().getStackTrace()[1].getClassName();
            Application app;
            try {
                app = (Application) Class.forName(className).getDeclaredConstructor().newInstance();
                app.start();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException("More than one instance!");
        }
    }
}

