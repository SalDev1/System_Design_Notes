package LLD.DesignATM.ATMStates;

import LLD.DesignATM.ATM;
import LLD.DesignATM.Card;
import LLD.DesignATM.AmountWithDrawal.CashWithDrawalProcessor;
import LLD.DesignATM.AmountWithDrawal.FiveHundredWithDrawalProcessor;
import LLD.DesignATM.AmountWithDrawal.OneHundredWithDrawalProcessor;
import LLD.DesignATM.AmountWithDrawal.TwoThousandWithDrawalProcessor;

public class CashWithDrawalState extends ATMState {    

    public void CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    public void cashWithDrawal(ATM atmObject, Card card, int withdrawAmount) {
        if(atmObject.getATMBalance() < withdrawAmount) {
            System.out.println("Insufficent balance in the ATM machine");
            exit(atmObject);
        } else if(card.getBalance() < withdrawAmount) {
            System.out.println("Insufficient balance in your Bank account");
            exit(atmObject);
        } else {
           card.deductBankBalance(withdrawAmount);
           atmObject.deductATMBalance(withdrawAmount);

           CashWithDrawalProcessor withDrawalProcessor = new TwoThousandWithDrawalProcessor(new FiveHundredWithDrawalProcessor(new OneHundredWithDrawalProcessor(null)));

           withDrawalProcessor.withdrawal(atmObject, withdrawAmount);
           exit(atmObject);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
