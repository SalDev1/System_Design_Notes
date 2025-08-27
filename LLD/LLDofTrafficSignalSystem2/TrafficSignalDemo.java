package LLD.LLDofTrafficSignalSystem2;

public class TrafficSignalDemo {
    public static void main(String[] args) {
        Intersection intersection = new Intersection("North-South", "East-West");
        for (int i = 0; i < 6; i++) {
            intersection.showSignals();
            intersection.changeSignals();
            try { Thread.sleep(1000); } 
            catch (InterruptedException ignored) {}
        }
    }
}
