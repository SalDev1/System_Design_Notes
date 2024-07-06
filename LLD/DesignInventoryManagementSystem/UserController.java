import java.util.List;

public class UserController {
    List<User> users;

    UserController(List<User> usersList) {
        this.users = usersList;
    }

    // add user
    public void addUser(User user) {
        users.add(user);
    }

    // remove user
    public void removeUser(User user) {
        users.remove(user);
    }

    // get particular user
    public User getUser(int userId) {
        for(User user : users) {
            if(user.userId == userId) {
                return user;
            }
        }
        return null;
    }
}
