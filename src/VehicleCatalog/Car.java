
package VehicleCatalog;
import Validation.ValidationClass;
public abstract class Car extends Vehicle {
    
    private int numDoor;
    private int passengerCapacity;
    private String fuelType;
    private double power;
    
    public Car(){
        this.numDoor=0;
        this.passengerCapacity=0;
        this.fuelType="";
        this.power=0.0;
    }
    
    public Car(String brand, String model, int year, double price, String color, double weight, boolean used, int numDoor, int passengerCapacity, String fuelType, double power){
        super(brand, model, year, price, color, weight, used);
        this.setNumDoor(numDoor);
        this.setPassengerCapacity(passengerCapacity);
        this.setFuelType(fuelType);
        this.setPower(power);
    }
    
    public final void setNumDoor(int numDoor){
        ValidationClass.ValidateNumDoor(numDoor);
        this.numDoor=numDoor;
    }
    
    public final void setPassengerCapacity(int passengerCapacity){
        ValidationClass.ValidatePassengerCapacity(passengerCapacity);
        this.passengerCapacity=passengerCapacity;
    }
    
    public final void setFuelType(String fuelType){
        ValidationClass.ValidateFuelType(fuelType);
        this.fuelType=fuelType;
    }
    
    public final void setPower(double power){
        ValidationClass.ValidatePower(power);
        this.power=power;
    }
    
    public int getNumDoor(){
        return this.numDoor;
    }
    
    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }
    
    public String getFuelType(){
        return this.fuelType;
    }
    
    public double getPower(){
        return this.power;
    }
    
    public abstract String assessment();
    
    @Override
    public String toString(){
        String str=super.toString()+"\nNumber of doors: "+this.numDoor+"\nPassenger capacity: "+this.passengerCapacity+"\nFuel type: "+this.fuelType+"\nPower: "+this.power;
        return str;
    }
}
