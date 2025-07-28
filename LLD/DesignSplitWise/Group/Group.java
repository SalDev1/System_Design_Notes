package LLD.DesignSplitWise.Group;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignSplitWise.Splitwise;
import LLD.DesignSplitWise.Expense.Expense;
import LLD.DesignSplitWise.Expense.ExpenseController;
import LLD.DesignSplitWise.Expense.ExpenseSplitType;
import LLD.DesignSplitWise.User.User;

public class Group {
    String groupId; 
    String groupName;

    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;

    Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User member) {
        groupMembers.add(member);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Splitwise> splitDetails, ExpenseSplitType splitType, User paidByUser) {
        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }
}
