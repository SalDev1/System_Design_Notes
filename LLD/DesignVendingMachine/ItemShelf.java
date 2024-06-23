package LLD.DesignVendingMachine;

public class ItemShelf {

    /*
         This shelf represents each single shelf
         in the vending machine.
        */
    Item item;
    int code ;
    boolean isSoldOut;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

}
