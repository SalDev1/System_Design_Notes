package LLD.DesignVendingMachine.VendingStates.Impl;

import LLD.DesignVendingMachine.Coin;
import LLD.DesignVendingMachine.Item;
import LLD.DesignVendingMachine.VendingMachine;
import LLD.DesignVendingMachine.VendingStates.State;

import java.util.List;

public class DispenseState implements State {

    DispenseState(VendingMachine machine , int codeNumber) throws Exception {
        System.out.println("Currently Vending Machine is in Dispense State");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        throw new Exception("insert coin button can not clicked");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection button can not be clicked in Dispense state ");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Disepnse state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
         throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense phase");
    }

}
