public abstract class AFuelCar extends ACar {

    String fuelType;
    int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.fuelType = fuelType;
        this.kmPrLitre = kmPrLitre;
    }

     abstract String getFuelType();
    abstract int getKmPrLitre();

    @Override
    public String toString() {
        return super.toString() + "The car runs on" + fuelType + "And you can drive: " +kmPrLitre+ " km/l";
    }
}
