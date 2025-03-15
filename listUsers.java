public void listUsers() {
    System.out.println("User  List:");
    for (User  user : users) {
        System.out.println(user.getName());
    }
}
}