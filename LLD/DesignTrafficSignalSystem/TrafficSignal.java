package LLD.DesignTrafficSignalSystem;

public class TrafficSignal {
    int trafficSignalId;
    String trafficSignalName;
    TrafficColor currentStatus;

    TrafficSignal(int trafficSignalId, String trafficSignalName) {
        this.trafficSignalId = trafficSignalId;
        this.trafficSignalName = trafficSignalName;
    }

    public int getTrafficSignalId() {
        return trafficSignalId;
    }

    public void setTrafficSignalId(int trafficSignalId) {
        this.trafficSignalId = trafficSignalId;
    }

    public String getTrafficSignalName() {
        return trafficSignalName;
    }

    public void setTrafficSignalName(String trafficSignalName) {
        this.trafficSignalName = trafficSignalName;
    }

    public TrafficColor getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(TrafficColor currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void updateTrafficSignal(String status) {
       if(status == "STOP") {
           this.currentStatus = TrafficColor.RED;
       } else if(status == "GO") {
           this.currentStatus = TrafficColor.GREEN;
       } else if(status == "WAIT") {
           this.currentStatus = TrafficColor.YELLOW;
       }
    }
}
