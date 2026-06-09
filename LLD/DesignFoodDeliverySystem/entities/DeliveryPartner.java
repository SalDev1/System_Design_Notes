package LLD.DesignFoodDeliverySystem.entities;

public class DeliveryPartner {
    public String partnerId;
    public String partnerName;
    public String partnerContact;
    public boolean isKycUpdated;

    public DeliveryPartner(String partnerId, String partnerName, String partnerContact, boolean isKycUpdated) {
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.partnerContact = partnerContact;
        this.isKycUpdated = isKycUpdated;
    }

    public String getPartnerId() {
        return partnerId;
    }
}
