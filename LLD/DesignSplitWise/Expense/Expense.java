package LLD.DesignSplitWise.Expense;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignSplitWise.Expense.Split.Split;
import LLD.DesignSplitWise.User.User;

public class Expense {

    String expenseId;
    String description;
    double expenseAmount;
    User paidByUser;
    ExpenseSplitType splitType;
    List<Split> splitDetails = new ArrayList<>();


    public Expense(String expenseId, String description, double expenseAmount, User paidByUser,
            ExpenseSplitType splitType, List<Split> splitDetails) {
        this.expenseId = expenseId;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
    }
}
