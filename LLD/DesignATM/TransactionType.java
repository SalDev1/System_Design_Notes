package LLD.DesignATM;

public enum TransactionType {
    BALANCE_CHECK,
    CASH_WITHDRAWAL;

    public static void showAllTransactionTypes() {
        for (TransactionType type : TransactionType.values()) {
            System.out.println(type);
        }
    }
}
