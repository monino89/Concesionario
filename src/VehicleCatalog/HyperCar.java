
package VehicleCatalog;
import Validation.ValidationClass;
public class HyperCar extends CarSport{
    
    private String hybridPropulsion;
    private int downForce;
    
    public HyperCar(){
        this.hybridPropulsion="";
        this.downForce=0;
    }
    public HyperCar(String brand, String model, int year, double price, String color, double weight, boolean used, int numDoor, int passengerCapacity, String fuelType, double power, double acceleration0to100, String material, String hybridPropulsion, int downForce){
        super(brand, model, year, price, color, weight, used, numDoor, passengerCapacity, fuelType, power, acceleration0to100, material);
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
    public String toString(){
        String str=super.toString()+"\nHybrid propulsion: "+this.hybridPropulsion+"\nDownForce: "+this.downForce;
        return str;
    }
}
