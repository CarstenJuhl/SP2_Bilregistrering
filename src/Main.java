public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car car1 = new GasolinCar("AE28810", "Chevrolet", "Aveo", 5, "Gasolin", 12);
        Car car2 = new DieselCar("PT98410", "Wolkswagon", "Transporter",4, "Diesel", 18, false);
        Car car3 = new DieselCar("PW33150", "Porche","Macan", 5, "Diesel", 11, true);
        Car car4 = new ElectricCar("FU66666", "Tesla", "Model_S", 5,1000000,600);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.addCar(car4);

        System.out.println(fleet);
        System.out.println("Total registration fee: "+ fleet.getTotalRegistrationFeeForFleet());

    }
}