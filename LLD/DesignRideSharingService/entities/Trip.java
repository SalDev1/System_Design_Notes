package LLD.DesignRideSharingService.entities;

import java.util.Date;

public class Trip {
    public String tripId;
    public String totalDistance;
    public String totalFare;
    public String sourceLocation;
    public String destinationLocation; 
    public Date arrivalTime;
    public Driver driverDetails;
}
