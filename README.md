                 "" WE CREATE USER CONTROLER CLASS principle procces ""
                 
<h1>User Class</h1>
<ul>
<li>This class represents a user with a single attribute <li>
  <br>
<li>It has a constructor to create a user with a specified name and a method getName() to retrieve the user's name</li>
</ul>

<h2>User Controller Class</h2>
<ul>

  <li>This class is responsible for managing users</li>
  <br>
  <li>it has a list (users) to store User  objects</li>
  <br>
  <li>The addUser (String name) method creates a new User  with the given name and adds it to the list, printing a message to confirm the addition</li>
  <br>
  <li>The listUsers() method prints out the names of all users currently in the list</li>
</ul>

<h3>Main Class</h3>
<ul>
  <li>This is the entry point of the application</li>
  <br>
  <li>In the main method, an instance of User Controller is created</li>
  <br>
  <li>It adds two users, "Alice" and "Bob", and then lists all the users</li>
</ul>

"" without principle   ""

<h1>USER CLASS</h1>
<ul>
  <li>Purpose: Represents a user with a single attribute, name</li>
  <br>
  <li>Constructor: Takes a String parameter to initialize the user's name.</li>
  <br>
  <li>Method:
getName(): Returns the name of the user</li>
</ul>

<h2>MAIN CLASS</h2>
<ul>
  <li>private static List<User> users = new ArrayList<>();: This is a static list that holds User  objects. It is shared across all methods in the Main class.</li
  <br>   
    <li>
      The entry point of the program where execution begins.
Calls addUser ("Alice") and addUser ("Bob") to add two users to the list.
Calls listUsers() to display the names of all users added
    </li>
    <br>
    <li>addUser (String name):
Creates a new User  object with the given name.
Adds the user to the users list.
Prints a confirmation message indicating that the user has been added.
listUsers():
Prints a header "User List:".
Iterates through the users list and prints the name of each user by calling getName() on each User  object.</li>
  </ul>
