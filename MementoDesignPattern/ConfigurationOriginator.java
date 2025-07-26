// Originator
package MementoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    // Originator doesn't exposes the implementation of storing
    // and restoring the previous state of the object.

    // Creating Object.
    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }
    // Restoring Object
    public void restoreMemento(ConfigurationMemento mementoToBeRestored) {
        this.height = mementoToBeRestored.height;
        this.width = mementoToBeRestored.width;
    }
}