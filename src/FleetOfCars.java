import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addCar (Car car){
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet(){
    int totalRegistrationFeeForFleet = 0;
        for (Car c:fleet){
            totalRegistrationFeeForFleet += c.getRegistrationFee();
        }
        return totalRegistrationFeeForFleet;
    }


    @Override
    public String toString() {
        return fleet.toString();
    }
}
