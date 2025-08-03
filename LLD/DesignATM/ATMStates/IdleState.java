package LLD.DesignATM.ATMStates;

import LLD.DesignATM.ATM;
import LLD.DesignATM.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
