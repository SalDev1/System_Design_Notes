package LLD.LLDofTrafficSignalSystem2;

public class GreenSignalState implements SignalState{
    @Override
    public void change(TrafficSignal signal) {
        signal.setState(new YellowSignalState());
    }
    @Override
    public String getColor() {
       return "GREEN";
    }
}
