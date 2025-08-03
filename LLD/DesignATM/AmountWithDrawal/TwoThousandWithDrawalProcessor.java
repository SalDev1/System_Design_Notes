package LLD.DesignATM.AmountWithDrawal;

import LLD.DesignATM.ATM;

public class TwoThousandWithDrawalProcessor extends CashWithDrawalProcessor {
    public TwoThousandWithDrawalProcessor(CashWithDrawalProcessor cashWithDrawalProcessor) {
        super(cashWithDrawalProcessor);
    }
    public void withdrawal(ATM atm, int remainingAmount) {
        int required = remainingAmount / 2000;
        int balance = remainingAmount % 2000;

        // If the atm is capable enough to satisfy the withdrawal request.
        if(required <= atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(required);
        } else if(required > atm.getNoOfTwoThousandNotes()) {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance = balance + (required - atm.getNoOfTwoThousandNotes()) * 2000;
        }

        if(balance != 0) {
            super.withdrawal(atm, balance);
        }
    }
    
}
