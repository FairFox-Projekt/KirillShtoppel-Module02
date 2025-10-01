public class Execution {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        manager.addUser(new User("Kirill", "somekirill@satbayev.university", "Administrator"));
        manager.addUser(new User("User2", "User2@gmail.com", "User"));
        manager.listUsers();
        manager.updateUser("Kirill", "somekirill2@satbayev.university", "Moderator");
        manager.removeUser("User2");
        System.out.println("After updates:");
        manager.listUsers();
    }
}