package LLD.DesignPaymentGateway.User;

public class UserController {
    UserService userService;
    public UserController() {
       userService =  new UserService();
    }

    public UserDO addUser(UserDO userDO) {
        return userService.addUser(userDO);
    }

    public UserDO getUserDO(int userID) {
       return userService.getUser(userID);
    }
}
