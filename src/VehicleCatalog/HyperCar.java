
package VehicleCatalog;
import Validation.ValidationClass;
public class HyperCar extends CarSport implements TrackOnly{
    
    private String hybridPropulsion;
    private int downForce;
    
    public HyperCar(){
        this.hybridPropulsion="";
        this.downForce=0;
    }
    public HyperCar(String brand, String model, int year, double price, String color, double weight, boolean used, int numDoor, int passengerCapacity, String fuelType, double power, double acceleration0to100, String material, String hybridPropulsion, int downForce,int vehicleId){
        super(brand, model, year, price, color, weight, used, numDoor, passengerCapacity, fuelType, power, acceleration0to100, material,vehicleId);
        this.setHybridPropulsion(hybridPropulsion);
        this.setDownForce(downForce);
    }
    
    public final void setHybridPropulsion(String hybridPropulsion){
        ValidationClass.ValidateHybridPropulsion(hybridPropulsion);
        this.hybridPropulsion=hybridPropulsion;
    }
    
    public final void setDownForce(int downForce){
        ValidationClass.ValidateDownForce(downForce);
        this.downForce=downForce;
    }
    
    public String getHybridPropulsion(){
        return this.hybridPropulsion;
    }
    
    public int getDownForce(){
        return this.downForce;
    }
    @Override
    public void showTrackOnly(){
        System.out.println(this.getModel()+"\nThis vehicle cannot be driven on public roads because it"+
            "\nlacks homologation, as it does not have the necessary safety equipment and does"+
            "\nnot comply with emissions and noise regulations."+
            "\nThis vehicle is exclusively for trcak racing");
    }
    @Override
    public String toString(){
        String str=super.toString()+"\nHybrid propulsion: "+this.hybridPropulsion+"\nDownForce: "+this.downForce;
        return str;
    }
}
