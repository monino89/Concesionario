package VehicleCatalog;
import Validation.ValidationClass;

public abstract class MotorBike extends Vehicle{
    private double cylinderCapacity;
    private String engineType;
    private String brakeType;
    
    public MotorBike(){
        this.cylinderCapacity=0.0;
        this.engineType="";
        this.brakeType="";
    }
    
    public MotorBike(String band, String model, int year, double price, String color, double weight, boolean used, double cylinderCapacity, String engineType, String brakeType){
        super(band, model, year, price, color, weight, used);
        this.setCylinderCapacity(cylinderCapacity);
        this.setEngineType(engineType);
        this.setBrakeType(brakeType);
    }
    
    public final void setCylinderCapacity(double cylinderCapacity){
        ValidationClass.ValidateCylinderCapacity(cylinderCapacity);
        this.cylinderCapacity=cylinderCapacity;
    }
    
    public final void setEngineType(String engineType){
        ValidationClass.ValidateEngineType(engineType);
        this.engineType=engineType;
    }
    
    public final void setBrakeType(String brakeType){
        ValidationClass.ValidateBrakeType(brakeType);
        this.brakeType=brakeType;
    }
    
    public double getCylinderCapacity(){
        return this.cylinderCapacity;
    }
    
    public String getEngineType(){
        return this.engineType;
    }
    
    public String getBrakeType(){
        return this.brakeType;
    }
    
    public abstract String assessment();
    
    @Override
    public String toString(){
        String str=super.toString()+"\nCylinder Capacity: "+this.cylinderCapacity+"\nEngine Type: "+this.engineType+"\nBrake Type: "+this.brakeType;
        return str;
    }
}
