package LLD.DesignPaymentGateway.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> userList = new ArrayList<>();

    // Mapping of the userDO from client side to the Java Side.
    public UserDO addUser(UserDO userDO) {
        User userObj = new User();
        
        userObj.setEmail(userDO.getEmail());
        userObj.setName(userDO.getName());
        userObj.setUserID(userDO.getUserID());

        userList.add(userObj);
        return convertUserDOFromUser(userObj);
    }

    public UserDO getUser(int userID) {
        for(User user : userList) {
            if(user.getUserID() == userID) {
                return convertUserDOFromUser(user);
            }
        }
        return null;
    }

    private UserDO convertUserDOFromUser(User userObj) {
        UserDO userDO = new UserDO();
        userDO.setEmail(userObj.getEmail());
        userDO.setName(userObj.getName());
        userDO.setUserID(userObj.getUserID());
        return userDO;
    }
}
