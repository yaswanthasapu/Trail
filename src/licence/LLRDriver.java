package licence;

public class LLRDriver extends ApplyingDrivingLicence{

    public String vehicleType;

    public LLRDriver(String name, String isGood, String vehicle){
        super(name,isGood,vehicle);

        vehicleType=vehicle;

    }
    public void setLicenceReport(){
        licenceReport="Approved";
    }

}
