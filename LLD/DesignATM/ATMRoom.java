package LLD.DesignATM;

public class ATMRoom {
    User user;
    ATM atm;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        // atmRoom.atm.printCurrentATMStatus();
        // atmRoom.atm.getCurrentATMState().insertCard(atm, atmRoom.user.card);
        atmRoom.atm.printCurrentATMState();
        // The user enters the card first in the idle state.
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithDrawal(atmRoom.atm, atmRoom.user.card, 2700);
        
        atmRoom.atm.printCurrentATMState();
    }
    
    public void initialize() {
        // Initialize the ATM room with required objects;
        atm = ATM.getATMObject();
        atm.setATMBalance(3000, 5,2,1);
        // create user
        this.user = createUser();
    }

    public User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    public Card createCard() {
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    public BankAccount createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 3000;
        return bankAccount;
    }
}
