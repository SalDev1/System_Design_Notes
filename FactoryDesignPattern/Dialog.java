package FactoryDesignPattern;

/*
   This dialog will have the creation mechanism 
   of Button + 
   
   We can add / developed multiple creation 
   mechanisms by extending the class according
   to our needs.
 */

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
