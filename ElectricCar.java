public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String getRegistrationNumber, String getMake, String getModel, int getNumberOfDoors, int batteryCapacity, int maxRange) {
        super(getRegistrationNumber, getMake, getModel, getNumberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }
    public int getMaxRange() {
        return maxRange;
    }
    public int getWhPrKm() {
        return batteryCapacity * 1000 / maxRange;
    }

    public int getRegistrationFee() {
        int fee=0;
        int kmPrLitre= (int)Math.floor(100/(getWhPrKm()/91.25));
        if((kmPrLitre >= 20) && (kmPrLitre <= 50)){ //Hvis km/l er mellem 20 og 50, er afgiften 330 kr.
            fee=330;
        } else if ((kmPrLitre>=15) && (kmPrLitre <=19)){ //Hvis km/l er mellem 15 og 19, er afgiften 1050 kr.
            fee=1050;
        } else if ((kmPrLitre >=10) && (kmPrLitre <=14)){ //Hvis km/l er mellem 10 og 14, er afgiften 2340 kr.
            fee=2340;
        } else if ((kmPrLitre >=5) && (kmPrLitre <= 9)){ //Hvis km/l er mellem 5 og 9, er afgiften 5500 kr.
            fee=5500;
        } else if  (kmPrLitre < 5){ //Hvis km/l er under 5, er registreringsafgiften 10470 kr.
            fee=10470;
        } else if (kmPrLitre>=51){ //Hvis km/l er 51 eller derover, er afgiften 0 kr.
            fee = 0;
        }
        return fee;
    }

    @Override
    public String toString(){
        return
           "\n Here is the electric car: "  +
           "\n "+super.toString()+
           "\n The battery capacity is: "+ getBatteryCapacityKWh()+
           "\n The max range is: "+ maxRange+ " km"+
           "\n The power consumption in watt hours/km is: " + getWhPrKm()+
           "\n The registration fee is: "+ getRegistrationFee()+" kr."+"\n";
    }
}
