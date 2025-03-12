import java.util.ArrayList;
import java.util.List;

public class UserWithoutController {
    private String name;
    private static List<UserWithoutController> users = new ArrayList<>();

    public UserWithoutController(String name) {
        this.name = name;
        users.add(this);
        System.out.println("User  added: " + this.name);
    }

    public static void listUsers() {
        System.out.println("User  List:");
        for (User WithoutController user : users) {
            System.out.println(user.name);
        }
    }