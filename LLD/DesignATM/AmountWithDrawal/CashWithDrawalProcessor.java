package LLD.DesignATM.AmountWithDrawal;

import LLD.DesignATM.ATM;

public abstract class CashWithDrawalProcessor {
    CashWithDrawalProcessor nexCashWithDrawalProcessor;

    CashWithDrawalProcessor(CashWithDrawalProcessor cashWithDrawalProcessor) {
        this.nexCashWithDrawalProcessor = cashWithDrawalProcessor;
    }

    public void withdrawal(ATM atm , int withdrawal) {
        if(nexCashWithDrawalProcessor != null) {
            nexCashWithDrawalProcessor.withdrawal(atm, withdrawal);
        }
    }
}
