public class GasolinCar extends AFuelCar {
    public GasolinCar(String getRegistrationNumber, String getMake, String getModel, int getNumberOfDoors, int kmPrLitre) {
        super(getRegistrationNumber, getMake, getModel, getNumberOfDoors, kmPrLitre);
    }
    @Override
    public String getFuelType() {
        return "Gasolin";
    }

    public int getRegistrationFee() {
        int fee=0;
        if((super.getKmPrLitre() >= 20) && (super.getKmPrLitre() <= 50)){ //Hvis bilen kører mellem 20 km/l og 50 km/l, er afgiften 330 kr.
            fee=330;
        } else if ((super.getKmPrLitre()>=15) && (super.getKmPrLitre()<=19)){ //Hvis bilen kører mellem 15 km/l og 19 km/l, er afgiften 1050 kr.
            fee=1050;
        } else if ((super.getKmPrLitre() >=10) && (super.getKmPrLitre() <=14)){ //Hvis bilen kører mellem 10 km/l og 14 km/l, er afgiften 2340 kr.
            fee=2340;
        } else if ((super.getKmPrLitre() >=5) && (super.getKmPrLitre() <= 9)){ //Hvis bilen kører mellem 5 km/l og 9 km/l, er afgiften 5500 kr.
            fee=5500;
        } else if  (super.getKmPrLitre()< 5){ //Hvis bilen kører under 5 km/l, er afgiften 10470 kr.
            fee=10470;
        }
        return fee;
    }

    @Override
    public String toString() {
        return
           "\n Here is the gasolin car: "  +
           "\n " + super.toString() +
           "\n This is the type of fuel: "+ getFuelType() +
           "\n This is the registration Fee: "+ getRegistrationFee() +" kr."+"\n";
    }
}
