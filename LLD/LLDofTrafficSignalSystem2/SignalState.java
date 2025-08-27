package LLD.LLDofTrafficSignalSystem2;

public interface SignalState {
    void change(TrafficSignal signal);
    String getColor();
}
