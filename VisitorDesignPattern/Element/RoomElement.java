package VisitorDesignPattern.Element;

import VisitorDesignPattern.Visitor.RoomVisitor;

public interface RoomElement {
    
    public void accept(RoomVisitor RoomVisitor);
}
