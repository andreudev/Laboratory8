package dependency.inversion;

public interface Connection {
    void executeQuery(String query);

    void poll();

    void dump();
}
