import java.util.ArrayList;
import java.util.List;

// User class representing a user entity
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class to run the application
public class Main {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        addUser ("Alice");
        addUser ("Bob");
        listUsers();
    }

    private static void addUser (String name) {
        User user = new User(name);
        users.add(user);
        System.out.println("User  added: " + name);
    }

    private static void listUsers() {
        System.out.println("User  List:");
        for (User  user : users) {
            System.out.println(user.getName());
        }
    }
}