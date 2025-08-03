package LLD.DesignATM;

public class Card {
    private int cvvNumber;
    private int cardNumber;
    private int expiryDate;
    static int PIN_NUMBER=112211;
    private BankAccount bankAccount;

    public boolean isCorrectPinEntered(int pin) {
        if(pin == PIN_NUMBER) {
            return true;
        }
        return false;
    }

    public int getBalance() {
        return bankAccount.balance;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deductBankBalance(int amount) {
        bankAccount.withdrawalBalance(amount);
    }
}
