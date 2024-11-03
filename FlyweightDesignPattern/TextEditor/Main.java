package FlyweightDesignPattern.TextEditor;

public class Main {
    public static void main(String[] args) {
        
        ILetter object1 = CharacterFactory.createLetter('t');
        object1.display(0, 1);

        ILetter object2 = CharacterFactory.createLetter('t');
        object2.display(0, 2);
    }
}
