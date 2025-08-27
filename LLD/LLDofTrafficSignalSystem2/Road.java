package LLD.LLDofTrafficSignalSystem2;

public class Road {
    private final String name;
    private final TrafficSignal signal;


    public Road(String name) {
      this.name = name;
      this.signal = new TrafficSignal();
    }


    public void changeSignal() { signal.change(); }


    public void showSignal() {
      System.out.println("Road " + name + " signal: " + signal.getColor());
    }
}
