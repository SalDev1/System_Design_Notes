package LLD.DesignTrafficSignalSystem;

public class TrafficSignalDemo {
    public static void main(String[] args) {
        Road road1 = new Road(1, "5th Avenue");
        Road road2 = new Road(2, "Main Street");

        Intersection intersection1 = new Intersection(1, "intersection1");
        Intersection intersection2 = new Intersection(2, "intersection2");
        TrafficSignal signal1 = new TrafficSignal(1, "Signal 1");
        TrafficSignal signal2 = new TrafficSignal(2, "Signal 2");

        road1.addIntersection(intersection1,signal1);
        road1.addIntersection(intersection2,signal2);

        road2.addIntersection(intersection1, signal1);
        road2.addIntersection(intersection2, signal2);

        TrafficSignal fetchedSignalForRoad1 = road1.getTrafficSignal(intersection1);
        fetchedSignalForRoad1.updateTrafficSignal("STOP");
        System.out.println(" Signal 1 : " + fetchedSignalForRoad1.getCurrentStatus());
        fetchedSignalForRoad1.updateTrafficSignal("WAIT");
        System.out.println(" Signal 1 : " + fetchedSignalForRoad1.getCurrentStatus());
        fetchedSignalForRoad1.updateTrafficSignal("GO");
        System.out.println(" Signal 1 : " + fetchedSignalForRoad1.getCurrentStatus());

        TrafficSignal fetchedSignalForRoad2 = road2.getTrafficSignal(intersection2);
        fetchedSignalForRoad2.updateTrafficSignal("WAIT");
        System.out.println(" Signal 2 : " + fetchedSignalForRoad2.getCurrentStatus());
        fetchedSignalForRoad2.updateTrafficSignal("STOP");
        System.out.println(" Signal 2 : " + fetchedSignalForRoad2.getCurrentStatus());
        fetchedSignalForRoad2.updateTrafficSignal("GO");
        System.out.println(" Signal 2 : " + fetchedSignalForRoad2.getCurrentStatus());
    }
}
