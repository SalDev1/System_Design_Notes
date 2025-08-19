package LLD.DesignPaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends BankService{

     @Override
    // Mapping all the instruments against the defined userID.
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
       CardInstrument cardInstrument = new CardInstrument();
       cardInstrument.instrumentID = new Random().nextInt(100-10)*10;
       cardInstrument.cardNumber = instrumentDO.bankAccountNumber;
       cardInstrument.instrumentType = InstrumentType.CARD;
       cardInstrument.userID = instrumentDO.userID;

       List<Instrument> userInstrumentList = userVsInstruments.get(cardInstrument.userID);
       if(userInstrumentList == null) {
          userInstrumentList = new ArrayList<>();
          userVsInstruments.put(cardInstrument.userID, userInstrumentList);
       }
       userInstrumentList.add(cardInstrument);
       return mapCardInstrumentToInstrumentDO(cardInstrument);
    }

    public InstrumentDO mapCardInstrumentToInstrumentDO(CardInstrument cardInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.instrumentType = InstrumentType.CARD;
        instrumentDO.instrumentID = cardInstrument.instrumentID;
        instrumentDO.cardNumber = cardInstrument.cardNumber;
        instrumentDO.cvv = cardInstrument.cvvNumber;
        instrumentDO.userID = cardInstrument.userID;
        return instrumentDO;
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserID(int userID) {
        List<Instrument> userInstruments = userVsInstruments.get(userID);
        List<InstrumentDO> fetchUserInstruments = new ArrayList<>();
        for(Instrument instrument : userInstruments) {
            if(instrument.getInstrumentType() == InstrumentType.CARD) {
                fetchUserInstruments.add(mapCardInstrumentToInstrumentDO((CardInstrument)instrument));
            }
        }
        return fetchUserInstruments;
    }

}
