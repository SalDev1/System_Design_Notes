package LLD.DesignSplitWise;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignSplitWise.Expense.ExpenseSplitType;
import LLD.DesignSplitWise.Expense.Split.Split;
import LLD.DesignSplitWise.Group.Group;
import LLD.DesignSplitWise.Group.GroupController;
import LLD.DesignSplitWise.User.User;
import LLD.DesignSplitWise.User.UserController;

public class Splitwise {
    UserController userController;
    GroupController groupController;

    BalanceSheetController balanceSheetController;

    SplitWise() {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void demo() {

        setupUserAndGroup();

        // Step 1 : add members to the group.
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U2002"));

        // Step 2 : create an expense in the group.
        List<Split> splits = new ArrayList<>();
        
        Split split1 = new Split(userController.getUser("U1001"), 300);
        Split split2 = new Split(userController.getUser("U2001"), 200);
        Split split3 = new Split(userController.getUser("U3001"), 100);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("Exp1001", "Breakfast", 900, splits, ExpenseSplitType.EQUAL, userController.getUser("U1001"));

        List<Split> splits2 = new ArrayList<>();
        Split split2_1 = new Split(userController.getUser("U1001"), 400);
        Split split2_2 = new Split(userController.getUser("u2001"), 3000);

        splits2.add(split2_1);
        splits2.add(split2_2);
        group.createExpense("Exp1002", "Lunch", 500, splits2, ExpenseSplitType.UNEQUAL, userController.getUser("U2001"));
    }

    public void setupUserAndGroup() {
// Create users 
      addUsersToSplitwiseApp();

      User user1 = userController.getUser("U1001");
      groupController.createNewGroup("g1001","Outing with Friends",user1);
    }

    private void addUsersToSplitwiseApp() {
        User user1 = new User("10001","User1");

        User user2 = new User("20001","User2");

        User user3 = new User("30001","User3");

        userController.addUser(user1);

        userController.addUser(user2);

        userController.addUser(user3);
    }
}
