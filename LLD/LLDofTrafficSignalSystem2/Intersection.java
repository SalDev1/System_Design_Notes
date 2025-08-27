package LLD.LLDofTrafficSignalSystem2;

public class Intersection {
    private final Road road1;
    private final Road road2;

    public Intersection(String r1, String r2) {
       this.road1 = new Road(r1);
       this.road2 = new Road(r2);
    }

    public void changeSignals() {
      road1.changeSignal();
      road2.changeSignal();
    }

    public void showSignals() {
       road1.showSignal();
       road2.showSignal();
       System.out.println("---");
    }
}
