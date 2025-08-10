package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Element.DeluxeRoom;
import VisitorDesignPattern.Element.DoubleRoom;
import VisitorDesignPattern.Element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic of Single Room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
       System.out.println("Pricing computation logic of Double Room");
       doubleRoom.roomPrice = 2500;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing computation logic of Deluxe Room");
        deluxeRoom.roomPrice = 3000;
    }
    
}
