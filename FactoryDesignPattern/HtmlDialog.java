package FactoryDesignPattern;

/* 
  The HtmlDialog specifies the creation Mechanism
  of the button type HTMLButton.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
