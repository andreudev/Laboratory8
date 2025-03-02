package dependency.inversion;

public class MySql implements Connection {
    public void executeQuery(String query) {
        System.out.println(query);
    }

    @Override
    public void poll() {
        System.out.println("Database is saved");
    }

    @Override
    public void dump() {
        System.out.println("Database is restored");
    }
}
