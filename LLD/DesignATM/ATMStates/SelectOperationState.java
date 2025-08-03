package LLD.DesignATM.ATMStates;

import LLD.DesignATM.ATM;
import LLD.DesignATM.Card;
import LLD.DesignATM.TransactionType;

public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        // Constructor logic if needed
        showOperations();
    }

    @Override
    public void selectOperation(ATM atmObject, Card card, TransactionType transactionType) {
        switch(transactionType) {
            case CASH_WITHDRAWAL:
                atmObject.setCurrentATMState(new CashWithDrawalState());
                break;
            case BALANCE_CHECK:
                atmObject.setCurrentATMState(new CheckBalanceState());  
                break;
            default:{
                System.out.println("Invalid option");
                exit(atmObject);
            }
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

    private void showOperations() {
        System.out.println("Please select an Operation");
        TransactionType.showAllTransactionTypes();
    }
}
