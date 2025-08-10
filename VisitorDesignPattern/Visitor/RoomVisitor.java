package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Element.DeluxeRoom;
import VisitorDesignPattern.Element.DoubleRoom;
import VisitorDesignPattern.Element.SingleRoom;

public interface RoomVisitor {
    // Room is polymoric in nature.
    public void visit(SingleRoom singleRoom);
    public void visit(DoubleRoom doubleRoom);
    public void visit(DeluxeRoom deluxeRoom);
}
