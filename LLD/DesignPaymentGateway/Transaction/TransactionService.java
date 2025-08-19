package LLD.DesignPaymentGateway.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import LLD.DesignPaymentGateway.Instrument.InstrumentController;
import LLD.DesignPaymentGateway.Instrument.InstrumentDO;

public class TransactionService {
    public static Map<Integer, List<Transaction>> userVsTransactionList = new HashMap<>();

    InstrumentController instrumentController;
    Processor processor;

    public TransactionService() {
        instrumentController = new InstrumentController();
        processor = new Processor();
    }

    public List<Transaction> getTransactionHistory(int userID) {
        // This ensures in returning a list of transactions based on the userID.
        return userVsTransactionList.get(userID);
    }

    public TransactionDO makePayment(TransactionDO txnDO) {
        InstrumentDO senderInstrumentDO = instrumentController.getInstrumentDOByID(txnDO.getSenderId(), txnDO.getDebitInstrumentId());
        InstrumentDO receiverInstrumentDO = instrumentController.getInstrumentDOByID(txnDO.getReceiverId(), txnDO.getCreditInstrumentId());

        processor.makePayment(senderInstrumentDO , receiverInstrumentDO);

        Transaction txn = new Transaction();

        txn.setAmount(txnDO.getAmount());
        txn.setTxnID(new Random().nextInt(100-10)+10);
        txn.setSenderUserID(txnDO.getSenderId());
        txn.setReceiverUserID(txnDO.getReceiverId());
        txn.setDebitInstrumentID(txnDO.getDebitInstrumentId());
        txn.setCreditInstrumentID(txnDO.getCreditInstrumentId());

        txn.setStatus(TransactionStatus.SUCCESS);
        List<Transaction> senderTxnsList = userVsTransactionList.get(txn.getSenderUserID());
        if(senderTxnsList == null) {
            senderTxnsList = new ArrayList<>();
            userVsTransactionList.put(txn.getSenderUserID(), senderTxnsList);
        }
        senderTxnsList.add(txn);

        List<Transaction> receiverTxnLists = userVsTransactionList.get(txn.getReceiverUserID());
        if(receiverTxnLists == null) {
            receiverTxnLists = new ArrayList<>();
            userVsTransactionList.put(txn.getReceiverUserID(), receiverTxnLists);
        }
        receiverTxnLists.add(txn);
        txnDO.setTxnID(txn.getTxnID());
        txnDO.setStatus(txn.getStatus());
        return txnDO;
    }
}
