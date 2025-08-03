package LLD.DesignATM.ATMStates;

import LLD.DesignATM.ATM;
import LLD.DesignATM.Card;

public class HasCardState extends ATMState{
    public HasCardState() {
        System.out.println("Enter your atm PIN");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);
        if (isCorrectPinEntered) {
            System.out.println("PIN authenticated successfully");
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
