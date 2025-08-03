package LLD.DesignATM.ATMStates;

import LLD.DesignATM.ATM;
import LLD.DesignATM.Card;

public class CheckBalanceState extends ATMState {
    public CheckBalanceState() {
        System.out.println("Check Balance State");
    }

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your current balance is: " + card.getBalance());
        exit(atm);
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
