package LLD.DesignVendingMachine.VendingStates;

import LLD.DesignVendingMachine.Coin;
import LLD.DesignVendingMachine.Item;
import LLD.DesignVendingMachine.VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine , Coin coin) throws  Exception;

    public void chooseProduct(VendingMachine machine, int code) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine , int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item,int codeNumber) throws Exception;
}
