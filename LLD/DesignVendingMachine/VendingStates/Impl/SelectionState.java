package LLD.DesignVendingMachine.VendingStates.Impl;

import LLD.DesignVendingMachine.Coin;
import LLD.DesignVendingMachine.Item;
import LLD.DesignVendingMachine.VendingMachine;
import LLD.DesignVendingMachine.VendingStates.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently Vending machine is in Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        // 1. get the item using the code number.
        Item item = machine.getInventory().getItem(code);

        // 2. Check the total amount paid by the user.
        int paidUser = 0;
        for(Coin coin : machine.getCoinList()) {
            paidUser += coin.value;
        }
        // 3.Compare the product price and amount paid by user.
        if(paidUser < item.getPrice()) {
            System.out.println("Insufficent Amount , Product you selected is for price: " + item.getPrice() + " and you paid: " + paidUser);
            refundFullMoney(machine);
            throw new Exception("insufficent amount");
        } else if(paidUser >= item.getPrice()) {
            if(paidUser > item.getPrice()) {
                getChange(paidUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, code));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
