package LLD.DesignTrafficSignalSystem;

public class Intersection {
    int intersectionId;
    String intersectionName;

    Intersection(int id , String name) {
        this.intersectionId = id;
        this.intersectionName = name;   
    }

    public int getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(int intersectionId) {
        this.intersectionId = intersectionId;
    }

    public String getIntersectionName() {
        return intersectionName;
    }

    public void setIntersectionName(String intersectionName) {
        this.intersectionName = intersectionName;
    }
}
