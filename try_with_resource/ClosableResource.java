
public class ClosableResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("closed!");
    }
}

