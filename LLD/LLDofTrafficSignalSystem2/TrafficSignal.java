package LLD.LLDofTrafficSignalSystem2;

// ----- TrafficSignal Entity -----
public class TrafficSignal {
    private SignalState state;
    public TrafficSignal() {
        this.state = new RedSignalState(); // default start
    }
    public void setState(SignalState state) {
         this.state = state;
    }
    public void change() {
        state.change(this);
    }
    public String getColor() {
        return state.getColor();
    }
}