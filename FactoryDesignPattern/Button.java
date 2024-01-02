package FactoryDesignPattern;

/*
   The Button is the product of the creator 
   called Dialog.
 */
public interface Button {
    void render();

    void onClick();
};
