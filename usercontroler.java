class UserController {
    private List<User> users;

    public UserController() {
        users = new ArrayList<>();
    }

    public void addUser (String name) {
        User user = new User(name);
        users.add(user);
    }
}