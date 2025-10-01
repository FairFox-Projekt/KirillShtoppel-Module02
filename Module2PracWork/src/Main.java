import java.util.*;
class User {
    private String name;
    private String email;
    private String role;
    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String toString() {
        return name + " (" + role + ") - " + email;
    }
}
class UserManager {
    private List<User> users = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(String name) {
        users.removeIf(u -> u.getName().equals(name));
    }
    public void updateUser(String name, String newEmail, String newRole) {
        for (User u : users) {
            if (u.getName().equals(name)) {
                u.setEmail(newEmail);
                u.setRole(newRole);
            }
        }
    }
    public void listUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
}

