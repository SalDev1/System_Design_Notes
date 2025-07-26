package MementoDesignPattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();

        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5, 10);

        ConfigurationMemento snapshot1 = originatorObject.createMemento();

        // add it to history.
        careTakerObject.addMemento(snapshot1);

        // originator changing to new state
        originatorObject.setHeight(7);
        originatorObject.setWidth(12);

        // save it
        ConfigurationMemento snapshot2 = originatorObject.createMemento();

        // add it to the history.
        careTakerObject.addMemento(snapshot2);

          // originator changing to new state
        originatorObject.setHeight(9);
        originatorObject.setWidth(14);

        // UNDO.
        //careTakerObject.undo();
        ConfigurationMemento restoreStateMementoObj = careTakerObject.undo();
        originatorObject.restoreMemento(restoreStateMementoObj);

        System.out.println("height : " + originatorObject.height + " width : " + originatorObject.width);
    }
}
