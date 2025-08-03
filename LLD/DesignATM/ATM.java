package LLD.DesignATM;

import LLD.DesignATM.ATMStates.ATMState;
import LLD.DesignATM.ATMStates.IdleState;

public class ATM {
    private static ATM atmObject = new ATM();
    ATMState currenAtmState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes; 

    private ATM() {

    }

    public void setCurrentATMState(ATMState atmState) {
        this.currenAtmState = atmState;
    }

    public ATMState getCurrentATMState() {
        return currenAtmState;
    }

    public static ATM getATMObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }

    public int getATMBalance() {
        return atmBalance;
    }

    public void setATMBalance(int atmBalance , int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }
    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int noOfNotes) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - noOfNotes;
    }

    public void deductFiveHundredNotes(int noOfNotes) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - noOfNotes;
    }
    public void deductOneHundredNotes(int noOfNotes) {
        noOfOneHundredNotes = noOfOneHundredNotes - noOfNotes;
    }

    public void printCurrentATMState() {
        System.out.println("Balance :" + atmBalance);
        System.out.println("2kNotes : " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);
    }
}
