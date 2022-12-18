public class DieselCar extends  AFuelCar{
    private int registrationFee;
    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber,make,model,numberOfDoors,fuelType,kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public int getKmPrLitre(){
        return this.kmPrLitre;
    }

    boolean hasParticleFilter(){
        return particleFilter;
    }

    public int getRegistrationFee(){
        int KmPrLitre = this.getKmPrLitre();
        int equalizationFee = 0;
        int particleFilterFee = 0;
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

        if (!particleFilter){
            particleFilterFee = 1000;

        }

        return registrationFee + equalizationFee + particleFilterFee;

    }

    @Override
    public String toString() {
        if (particleFilter){
            return super.toString() + "The car is equiped with a particle filter. \n";
        }

        return super.toString() + "The car is not equiped with a particle filter.";
    }
}
