package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Element.DeluxeRoom;
import VisitorDesignPattern.Element.DoubleRoom;
import VisitorDesignPattern.Element.SingleRoom;

public class RoomMaintainerVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
       System.out.println("Maintenance for Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
         System.out.println("Maintenance for Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
          System.out.println("Maintenance for Deluxe Room");
    }
}
