package FlyweightDesignPattern;

public class Main {
   public static void main(String[] args) {
    IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
    humanoidRobot1.display(1, 2);

    IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
    humanoidRobot2.display(9, 10);

    IRobot roboticDog1 = RoboticFactory.createRobot("ROBOTICDOG");
    roboticDog1.display(11, 12);

    IRobot roboticDog2 = RoboticFactory.createRobot("ROBOTICDOG");
    roboticDog2.display(13, 14);
   }
}
