
package VehicleCatalog;
import Validation.ValidationClass;
public class HyperMotorbike extends Sport{
    
    private double maxSpeed;
    private int downForce;
    
    public HyperMotorbike(){
        this.maxSpeed=0.0;
        this.downForce=0;
    }
    
    public HyperMotorbike(String brand, String model, int year, double price, String color, double weight, boolean used, double cylinderCapacity, String engineType, String brakeType, String chassisMaterial, double aceleration0to100, double maxSpeed, int downForce,int vehicleId){
        super(brand, model, year, price, color, weight, used, cylinderCapacity, engineType, brakeType, chassisMaterial, aceleration0to100,vehicleId);
        this.setMaxSpeed(maxSpeed);
        this.setDownForce(downForce);
    }
    
    public final void setMaxSpeed(double maxSpeed){
        ValidationClass.ValidateMaxSpeed(maxSpeed);
        this.maxSpeed=maxSpeed;
        
    }
    
    public final void setDownForce(int downForce){
        ValidationClass.ValidateDownForce(downForce);
        this.downForce=downForce;
    }
    
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public int getDownForce(){
        return this.downForce;
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nMax speed: "+this.maxSpeed+"\nDownForce: "+this.downForce;
        return str;
    }
}
