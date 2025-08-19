package LLD.DesignPaymentGateway.Instrument;

import java.util.List;

public class InstrumentController {
    InstrumentServiceFactory instrumentControllerFactory;

    public InstrumentController() {
        this.instrumentControllerFactory = new InstrumentServiceFactory();
    }

    public InstrumentDO addInstrument(InstrumentDO instrument) {
        InstrumentService instrumentController = 
            instrumentControllerFactory.getInstrumentService(instrument.instrumentType);

        return instrumentController.addInstrument(instrument);
    }

    public List<InstrumentDO> getAllInstruments(int userID) {
        InstrumentService bankInstrumentController = instrumentControllerFactory.getInstrumentService(InstrumentType.BANK);
        InstrumentService cardInstrumentController = instrumentControllerFactory.getInstrumentService(InstrumentType.CARD);

        List<InstrumentDO> instrumentDOList = bankInstrumentController.getInstrumentByUserID(userID);
        instrumentDOList.addAll(cardInstrumentController.getInstrumentByUserID(userID));
        return instrumentDOList;
    }

    public InstrumentDO getInstrumentDOByID(int userID , int instrumentID) {
        List<InstrumentDO> instrumentDOList = getAllInstruments(userID);
        for(InstrumentDO instrumentDO : instrumentDOList) {
            if(instrumentDO.instrumentID == instrumentID) {
                return instrumentDO;
            }
        }
        return null;
    }
}
