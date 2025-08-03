package LLD.DesignATM.AmountWithDrawal;

import LLD.DesignATM.ATM;

public class FiveHundredWithDrawalProcessor extends CashWithDrawalProcessor {
    public FiveHundredWithDrawalProcessor(CashWithDrawalProcessor cashWithDrawalProcessor) {
        super(cashWithDrawalProcessor);
    }

    public void withdrawal(ATM atm , int remainingAmount) {
        int required = remainingAmount / 500;
        int balance = remainingAmount % 500;
        // If the atm is capable enough to satisfy the withdrawal request.
        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        } else if(required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required - atm.getNoOfFiveHundredNotes()) * 500;
        }
        if(balance != 0) {
            super.withdrawal(atm, balance);
        }
    }
}
