public class User {
    private String name;
    private String address;
    // others attributes such as email, phone, etc.

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}