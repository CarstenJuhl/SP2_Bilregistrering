public class ElectricCar extends  ACar{
    private int batteryCapacity;
    private int maxRange;
    private int registrationFee;
    private int WhPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.WhPrKm = (batteryCapacity/maxRange);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm(){
        return WhPrKm;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    public int getRegistrationFee(){
        int KmPrLitre = (int) (100/(WhPrKm/91.25));
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
    public String toString() {
        return super.toString() +
                "batteryCapacity: " + batteryCapacity +
                " watts, and a maxRange:" + maxRange +
                " km per full charge";
    }
}
