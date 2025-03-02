package dependency.inversion;

public final class DataBase {

    private Connection connection;

    public DataBase(Connection connection) {
        this.connection = connection;
    }

    public void executeQuery(String query) {
        connection.executeQuery(query);
    }

    public void dump() {
        connection.dump();
    }

    public void poll() {
        connection.poll();
    }
}
