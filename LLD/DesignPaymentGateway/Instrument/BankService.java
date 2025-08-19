package LLD.DesignPaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService{

    @Override
    // Mapping all the instruments against the defined userID.
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
       BankInstrument bankInstrument = new BankInstrument();
       bankInstrument.instrumentID = new Random().nextInt(100-10)*10;
       bankInstrument.bankAccountNo = instrumentDO.bankAccountNumber;
       bankInstrument.instrumentType = InstrumentType.BANK;
       bankInstrument.ifscCode = instrumentDO.ifsc;
       bankInstrument.userID = instrumentDO.userID;

       List<Instrument> userInstrumentList = userVsInstruments.get(bankInstrument.userID);
       if(userInstrumentList == null) {
          userInstrumentList = new ArrayList<>();
          userVsInstruments.put(bankInstrument.userID, userInstrumentList);
       }
       userInstrumentList.add(bankInstrument);
       return mapBankInstrumentToInstrumentDO(bankInstrument);
    }

    public InstrumentDO mapBankInstrumentToInstrumentDO(BankInstrument bankInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.instrumentType = InstrumentType.BANK;
        instrumentDO.instrumentID = bankInstrument.instrumentID;
        instrumentDO.bankAccountNumber = bankInstrument.bankAccountNo;
        instrumentDO.ifsc = bankInstrument.ifscCode;
        instrumentDO.userID = bankInstrument.userID;
        return instrumentDO;
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserID(int userID) {
        List<Instrument> userInstruments = userVsInstruments.get(userID);
        List<InstrumentDO> fetchUserInstruments = new ArrayList<>();
        for(Instrument instrument : userInstruments) {
            if(instrument.getInstrumentType() == InstrumentType.BANK) {
                fetchUserInstruments.add(mapBankInstrumentToInstrumentDO((BankInstrument)instrument));
            }
        }
        return fetchUserInstruments;
    }
    
}
