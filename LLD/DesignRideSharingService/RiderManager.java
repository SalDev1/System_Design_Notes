package LLD.DesignRideSharingService;

import java.util.Map;

import LLD.DesignRideSharingService.entities.Rider;

public class RiderManager {
    Map<String, Rider> riders;

    void addRider(Rider rider) {
        riders.put(rider.riderContactNo, rider);
    }

    void removeRider(String riderContactNo) {
        riders.remove(riderContactNo);
    }
}
