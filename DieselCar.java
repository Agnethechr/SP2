public class DieselCar extends AFuelCar {
    private final boolean hasParticleFilter;

    public DieselCar(String getRegistrationNumber, String getMake, String getModel, int getNumberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(getRegistrationNumber, getMake, getModel, getNumberOfDoors, kmPrLitre);
        this.hasParticleFilter = particleFilter;
    }
    @Override
    public String getFuelType() {
        return "Diesel";
    }
    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    public int getRegistrationFee() {
        int dieselFee=0;
        if (!hasParticleFilter()){
            dieselFee+=1000;
        }
        if((super.getKmPrLitre()>=20) && (super.getKmPrLitre()<=50)){ //Hvis bilen kører mellem 20 km/l og 50 km/l, er afgiften 130 kr.
            dieselFee+=130;
        } else if ((super.getKmPrLitre()>=15)&&(super.getKmPrLitre()<=19)){ //Hvis bilen kører mellem 15 km/l og 19 km/l, er afgiften 1390 kr.
            dieselFee+=1390;
        } else if ((super.getKmPrLitre()>=10)&&(super.getKmPrLitre()<=14)){ //Hvis bilen kører mellem 10 km/l og 14 km/l, er afgiften 1850 kr.
            dieselFee+=1850;
        } else if ((super.getKmPrLitre()>=5)&&(super.getKmPrLitre()<=9)){ //Hvis bilen kører mellem 5 km/l og 9 km/l, er afgiften 2770 kr.
            dieselFee+=2770;
        } else if (super.getKmPrLitre()<5){ //Hvis bilen kører under 5 km/l, er afgiften 15260 kr.
            dieselFee+=15260;
        }
        return dieselFee;
    }

    @Override
    public String toString(){
        return
           "\n Here is the diesel car: "  +
           "\n "+super.toString()+
           "\n This is the type of fuel: "+ getFuelType()+
           "\n Has particle filter: "+ hasParticleFilter+
           "\n This is the registration fee: "+ getRegistrationFee()+" kr."+"\n";

    }
}


