package LLD.DesignATM.AmountWithDrawal;

import LLD.DesignATM.ATM;

public class OneHundredWithDrawalProcessor extends CashWithDrawalProcessor{
    public OneHundredWithDrawalProcessor(CashWithDrawalProcessor cashWithDrawalProcessor) {
        super(cashWithDrawalProcessor);
    }

    public void withdrawal(ATM atm, int remainingAmount) {
        int required = remainingAmount / 100;
        int balance = remainingAmount % 100;

        // If the atm is capable enough to satisfy the withdrawal request.
        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        } else if(required > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required - atm.getNoOfOneHundredNotes()) * 100;
        }
        
        if(balance != 0) {
            super.withdrawal(atm, balance);
        }
    }
}
