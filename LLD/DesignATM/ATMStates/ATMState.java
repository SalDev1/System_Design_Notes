package LLD.DesignATM.ATMStates;

import LLD.DesignATM.ATM;
import LLD.DesignATM.Card;
import LLD.DesignATM.TransactionType;

public class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS !! Something went wrong. Please try again.");
    }
    public void authenticatePin(ATM atm, Card card , int pin) {
        System.out.println("OOPS !! Something went wrong. Please try again.");
    }
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("OOPS !! Something went wrong. Please try again.");
    }
    public void cashWithDrawal(ATM atm, Card card, int withdrawAmount) {
        System.out.println("OOPS !! Something went wrong. Please try again.");
    }
    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS !! Something went wrong");
    }

    public void returnCard() {
        System.out.println("OOPS !! Something went wrong. Please try again.");
    }
    public void exit(ATM atm) {
        System.out.println("OOPS !! Something went wrong. Please try again.");
    }   
}
