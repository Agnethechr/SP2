public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car car1 = new GasolinCar("JC 12 345", "Fiat", "500", 2, 30);
        Car car2 = new ElectricCar("OC 14 678", "Tesla", "Model S", 4, 100, 500);
        Car car3 = new DieselCar("HC 15 823", "Volvo", "XC90", 5, 40, true);

        String registrationNumber = car1.getRegistrationNumber();
        String make = car1.getMake();
        String model = car1.getModel();
        int numberOfDoors = car1.getNumberOfDoors();

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);
    }
}