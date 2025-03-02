package single.responsibility;

public class PasswordManager {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(String user, String password) {
        return this.password.equals(password);
    }
}