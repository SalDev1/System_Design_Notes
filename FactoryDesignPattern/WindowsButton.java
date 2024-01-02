package FactoryDesignPattern;

public class WindowsButton implements Button {

    @Override
    public void render() {
        // TODO Auto-generated method stub
        System.out.println("<button>Windows Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        // TODO Auto-generated method stub
        System.out.println("Click! Button says - Hello Windows 11!");
    }
}
