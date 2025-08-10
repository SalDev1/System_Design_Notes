package VisitorDesignPattern;

import VisitorDesignPattern.Element.DeluxeRoom;
import VisitorDesignPattern.Element.DoubleRoom;
import VisitorDesignPattern.Element.SingleRoom;
import VisitorDesignPattern.Visitor.RoomMaintainerVisitor;
import VisitorDesignPattern.Visitor.RoomPricingVisitor;

public class Main {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();

        RoomPricingVisitor roomPricingVistior = new RoomPricingVisitor();
        RoomMaintainerVisitor roomMaintainerVisitor = new RoomMaintainerVisitor();

        singleRoom.accept(roomPricingVistior);
        singleRoom.accept(roomMaintainerVisitor);
        System.out.println(singleRoom.roomPrice);

        doubleRoom.accept(roomPricingVistior);
        doubleRoom.accept(roomMaintainerVisitor);
        System.out.println(doubleRoom.roomPrice);

        deluxeRoom.accept(roomPricingVistior);
        deluxeRoom.accept(roomMaintainerVisitor);
        System.out.println(deluxeRoom.roomPrice);
    }
}
