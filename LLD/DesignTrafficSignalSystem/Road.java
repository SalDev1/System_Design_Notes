package LLD.DesignTrafficSignalSystem;

import java.util.HashMap;
import java.util.Map;

public class Road {
    int roadId; 
    String roadName; 
    Map<Intersection,TrafficSignal> intersections = new HashMap<>();

    Road(int roadId, String roadName) {
        this.roadId = roadId;
        this.roadName = roadName;
    }
    public int getRoadId() {
        return roadId;
    }
    public void setRoadId(int roadId) {
        this.roadId = roadId;
    }
    public String getRoadName() {
        return roadName;
    }
    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }
    public Map<Intersection, TrafficSignal> getIntersections() {
        return intersections;
    }
    public void setIntersections(Map<Intersection, TrafficSignal> intersections) {
        this.intersections = intersections;
    }
    // Helps you add intersection + traffic signal for each road.
    public void addIntersection(Intersection intersection , TrafficSignal trafficSignal) {
        this.intersections.put(intersection, trafficSignal);
    }

    public TrafficSignal getTrafficSignal(Intersection intersection) {
        if(intersections.containsKey(intersection)) {
            return intersections.get(intersection);
        }
        return null;
    }
}
