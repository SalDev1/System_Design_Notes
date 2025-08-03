package LLD.DesignATM;

public class BankAccount {
    int balance; 
    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }
}
