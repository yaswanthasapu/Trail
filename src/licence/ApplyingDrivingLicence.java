package licence;

public class ApplyingDrivingLicence {
     String name;
     int rating;
     String isGood;
     String licenceReport;

    public ApplyingDrivingLicence (String name,String isGood,String vehicle){
        this.name = name;
        rating=5;
        this.isGood= String.valueOf(isGood);

    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }



    public String getIsProvisional() {
        return isGood;
    }

    public void setLicenceReport() {
        licenceReport="Approved";
    }


    public void deduct(int p){
        if(rating<p){

            System.out.println("Licence approved for "+name);

        }else {
            rating=0;

        }
        if(rating==0){
            System.out.println("Licence not approved for "+name);

        }

    }



}
