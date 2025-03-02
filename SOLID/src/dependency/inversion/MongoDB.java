package dependency.inversion;

public class MongoDB implements Connection {

    public void executeQuery(String query) {
        System.out.println(query);
    }

    public void poll() {
        System.out.println("Database is saved");
    }

    public void dump() {
        System.out.println("Database is restored");
    }
}
