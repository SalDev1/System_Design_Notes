package LLD.DesignSplitWise.Expense;

import LLD.DesignSplitWise.Expense.Split.EqualExpenseSplit;
import LLD.DesignSplitWise.Expense.Split.ExpenseSplit;
import LLD.DesignSplitWise.Expense.Split.PercentageExpenseSplit;
import LLD.DesignSplitWise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {
        switch(splitType) {
            case EQUAL: 
              return new EqualExpenseSplit();
            case UNEQUAL: 
              return new UnequalExpenseSplit();
            case PERCENTAGE: 
              return new PercentageExpenseSplit();
            default:
            return null;
        }
    }
}
