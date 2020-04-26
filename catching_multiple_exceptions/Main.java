import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger("Main");
    public static void main(String[] args) {
        try {
            // ...
        } catch (SQLException | RemoteException | NullPointerException ex) {
            LOGGER.log(ex);
        }
    }
}

