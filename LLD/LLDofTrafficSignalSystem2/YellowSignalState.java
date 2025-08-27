package LLD.LLDofTrafficSignalSystem2;

public class YellowSignalState implements SignalState{
    @Override
    public void change(TrafficSignal signal) {
        signal.setState(new RedSignalState());
    }
    @Override
    public String getColor() {
        return "YELLOW";
    }   
}
