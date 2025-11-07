
package VehicleCatalog;
import Validation.ValidationClass;
public class Pickup extends Car {
    
    private double loadCapacity;
    private double plateSize;
    private String traction;
    
    public Pickup(){
        this.loadCapacity=0.0;
        this.plateSize=0.0;
        this.traction="";
    }
    
    public Pickup(String brand, String model, int year, double price, String color, double weight, boolean used, int numDoor, int passengerCapacity, String fuelType, double power, double loadCapacity, double plateSize, String traction){
        super(brand, model, year, price, color, weight, used, numDoor, passengerCapacity, fuelType, power);
        this.setLoadCapacity(loadCapacity);
        this.setPlateSize(plateSize);
        this.setTraction(traction);
    }
    
    public final void setLoadCapacity(double loadCapacity){
        ValidationClass.ValidateLoadCapacity(loadCapacity);
        this.loadCapacity=loadCapacity;
    }
    
    public final void setPlateSize(double plateSize){
        ValidationClass.ValidatePlateSize(plateSize);
        this.plateSize=plateSize;
    }
    
    public final void setTraction(String traction){
        ValidationClass.ValidateTraction(traction);
        this.traction=traction;
    }
    
    public double getLoadCapacity(){
        return this.loadCapacity;
    }
    
    public double getPlateSize(){
        return this.plateSize;
    }
    
    public String getTraction(){
        return this.traction;
    }
    
    //METODO ABSTRACTO
    @Override
    public String assessment() {
        String str="\nCar rating 7.2/10 ☆";
        return str;
    }

    //METODO UNICO 
    @Override
    public void showPrice() {
        System.out.println("\nINFORMATION PRICE:\n"+this.getPrice()+" COL");

    }

    //METODO UNICO 
    @Override
    public void showState() {
        if(this.getUsed()==true){
            System.out.println("\nMilage: 120,000km");
        }else{
            System.out.println("\nMilage: 0km");
        }
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nLoad capacity: "+this.loadCapacity+"\nPlate size: "+this.plateSize+"\nTraction: "+this.traction;
        return str;
    }
    
    
    //METODO UNICO
    public void allTerrainMode(){
        System.out.println("\nSand, mud, rock or slope: nothing stops its power.");
    }
    
    //METODO UNICO
    public void showCapacity(){
        System.out.println("\nIts reinforced chassis and large cargo area allow you to transport more,"+"\nwith greater safety and stability, without sacrificing comfort or performance.");
    }
}
