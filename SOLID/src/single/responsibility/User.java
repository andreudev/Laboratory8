package single.responsibility;

public class User {
    private String firstName;
    private String lastName;
    private String user;
    private String email;
    private Address address;
    private PasswordManager passwordManager;

    public User() {
        this.address = new Address();
        this.passwordManager = new PasswordManager();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public PasswordManager getPasswordManager() {
        return passwordManager;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}