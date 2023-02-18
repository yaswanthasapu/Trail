package licence;

public class Main {
    public static void main(String[]args){
        ApplyingDrivingLicence ram=new ApplyingDrivingLicence("Ram","Valid","2-Wheel");
        ram.deduct(8);
        ram.setLicenceReport();

        ApplyingDrivingLicence lucky = new ApplyingDrivingLicence("Lucky","Fake","4-Wheel");
        lucky.deduct(5);
        lucky.setLicenceReport();

        LLRDriver sita=new LLRDriver("Sita","Valid","4Wheel");
        sita.deduct(10);
        sita.setLicenceReport();

        ApplyingDrivingLicence[] driverArray=new ApplyingDrivingLicence[3];
        driverArray[0]=ram;
        driverArray[1]=sita;
        driverArray[2]=lucky;

        for(int i=0;i<driverArray.length;i++){
            System.out.println(driverArray[i].getName()+" document validation: "+driverArray[i].getIsProvisional());

            System.out.println(driverArray[i].getName()+" got: "+ driverArray[i].getRating()+" rating ");

            }

    }
}
