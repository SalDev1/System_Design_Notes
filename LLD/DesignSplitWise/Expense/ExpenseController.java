package LLD.DesignSplitWise.Expense;

import java.util.List;

import LLD.DesignSplitWise.BalanceController;
import LLD.DesignSplitWise.Expense.Split.ExpenseSplit;
import LLD.DesignSplitWise.Expense.Split.Split;
import LLD.DesignSplitWise.User.User;

public class ExpenseController {
    BalanceController balanceController;

    public ExpenseController() {
        balanceController = new BalanceController();
    }

    // This method will create a new expense based on the require parameters.
    public Expense createExpense(String expenseId, String description , double expenseAmount , List<Split> splits, ExpenseSplitType splitType , User paidByUser) {
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splits, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, splitType, splits);
        return expense;
    }
}
