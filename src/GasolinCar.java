public class GasolinCar extends AFuelCar{

    private int registrationFee;


    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors,fuelType,kmPrLitre);
    }

    public int getRegistrationFee(){
        int KmPrLitre = this.getKmPrLitre();
        if (KmPrLitre < 50 && KmPrLitre >= 20){
            registrationFee = 330;
        }
        else if(KmPrLitre < 20 && KmPrLitre >= 15){
            registrationFee = 1050;
        }
        else if(KmPrLitre < 15 && KmPrLitre >= 10){
            registrationFee = 2340;
        }
        else if(KmPrLitre < 10 && KmPrLitre >= 5){
            registrationFee = 55000;
        }
        else if(KmPrLitre < 5){
            registrationFee = 10470;
        }

        return registrationFee;


    }


    @Override
    String getFuelType() {
        return this.fuelType;
    }

    @Override
    int getKmPrLitre() {
        return this.kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
