import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car>fleet=new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int registration=0;
        for (Car i: fleet) {
            registration += i.getRegistrationFee();
        }
        return registration;
    }

    @Override
    public String toString() {
        String result="";
        for (Car c: fleet) {
            result += c;
        }
        return result+ "\n total registration fee: " + getTotalRegistrationFeeForFleet();
    }
}
