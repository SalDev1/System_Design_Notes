package LLD.DesignPaymentGateway;

import java.util.List;

import LLD.DesignPaymentGateway.Instrument.InstrumentController;
import LLD.DesignPaymentGateway.Instrument.InstrumentDO;
import LLD.DesignPaymentGateway.Instrument.InstrumentType;
import LLD.DesignPaymentGateway.Transaction.Transaction;
import LLD.DesignPaymentGateway.Transaction.TransactionController;
import LLD.DesignPaymentGateway.Transaction.TransactionDO;
import LLD.DesignPaymentGateway.User.UserController;
import LLD.DesignPaymentGateway.User.UserDO;

public class PaymentGateway {
    public static void main(String[] args) {
        InstrumentController instrumentController = new InstrumentController();
        UserController userController = new UserController();
        TransactionController transactionController = new TransactionController();


        // 1. add user 1
        UserDO user1 = new UserDO();
        user1.setName("Salman");
        user1.setEmail("salman@gmail.com");
        user1.setUserID(17977);
        UserDO user1Details = userController.addUser(user1);

        // 2. add user 2
        UserDO user2 = new UserDO();
        user2.setName("Sam");
        user2.setEmail("sam@gmail.com");
        user2.setUserID(23423);
        UserDO user2Details = userController.addUser(user2);

        // add bank to user1
        InstrumentDO bankInstrumentDO = new InstrumentDO();
        bankInstrumentDO.setBankAccountNumber("441002010062565");
        bankInstrumentDO.setInstrumentType(InstrumentType.BANK);
        bankInstrumentDO.setUserID(user1Details.getUserID());
        bankInstrumentDO.setIfsc("ICIC0004096");
        InstrumentDO user1BankInstrument = instrumentController.addInstrument(bankInstrumentDO);
        System.out.println("Bank Instrument created by user1 : " + user1BankInstrument.getInstrumentID());

        // add card to user2
        InstrumentDO cardInstrumentDO = new InstrumentDO();
        cardInstrumentDO.setCardNumber("4410 2324 3455 5678");
        cardInstrumentDO.setInstrumentType(InstrumentType.CARD);
        cardInstrumentDO.setCvv("123");
        cardInstrumentDO.setUserID(user2Details.getUserID());
        InstrumentDO user2BankInstrument = instrumentController.addInstrument(cardInstrumentDO);
        System.out.println("Bank Instrument created by user1 : " + user2BankInstrument.getInstrumentID());

        // make payment
        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setAmount(10);
        transactionDO.setSenderId(user1Details.getUserID());
        transactionDO.setReceiverId(user2Details.getUserID());
        transactionDO.setDebitInstrumentId(user1BankInstrument.getInstrumentID());
        transactionDO.setCreditInstrumentId(user2BankInstrument.getInstrumentID());

        transactionController.makePayment(transactionDO);

        // get all instruments of USER1
        List<InstrumentDO> user1Instruments = instrumentController.getAllInstruments(user1Details.getUserID());
        for(InstrumentDO instrumentDO : user1Instruments) {
            System.out.println("User1 InstID : " + instrumentDO.getInstrumentID() 
            + "User ID: " + instrumentDO.getUserID() 
            + "InstrumentType : " + instrumentDO.getInstrumentType().name() + '\n');
        }

       List<InstrumentDO> user2Instruments = instrumentController.getAllInstruments(user2Details.getUserID());
        for(InstrumentDO instrumentDO : user2Instruments) {
            System.out.println("User2 InstID : " + instrumentDO.getInstrumentID() 
            + " User ID: " + instrumentDO.getUserID() 
            + " InstrumentType : " + instrumentDO.getInstrumentType().name() + '\n');
        }


        List<Transaction> user1TransactionList = transactionController.getTransactionHistory(user1Details.getUserID());
        for(Transaction transaction : user1TransactionList) {
            System.out.println("All transactions of User 1 : " + transaction.getTxnID());
        }
    }
}
