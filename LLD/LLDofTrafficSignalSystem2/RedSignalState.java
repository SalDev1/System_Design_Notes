package LLD.LLDofTrafficSignalSystem2;

public class RedSignalState implements SignalState{
    @Override
    public void change(TrafficSignal signal) {
       signal.setState(new GreenSignalState());
    }
    @Override
    public String getColor() {
       return "RED";
    }
}
