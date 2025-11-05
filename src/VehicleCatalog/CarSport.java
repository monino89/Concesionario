
package VehicleCatalog;
import Validation.ValidationClass;
public class CarSport extends Car {
    
    private double acceleration0to100;
    private String material;
    
    public CarSport(){
        this.acceleration0to100=0.0;
        this.material="";
    }
    
    public CarSport(String brand, String model, int year, double price, String color, double weight, boolean used, int numDoor, int passengerCapacity, String fuelType, double power, double acceleration0to100, String material){
        super(brand, model, year, price, color, weight, used, numDoor, passengerCapacity, fuelType, power);
        this.setAcceleration0to100(acceleration0to100);
        this.setMaterial(material);
    }
    
    public final void setAcceleration0to100(double acceleration0to100){
        ValidationClass.ValidationAcceleration0to100(acceleration0to100);
        this.acceleration0to100=acceleration0to100;
    }
    
    public final void setMaterial(String material){
        ValidationClass.ValidateMaterial(material);
        this.material=material;
    }
    
    public double getAcceleration0to100(){
        return this.acceleration0to100;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    //METODO ABSTRACTO
    @Override
    public String assessment(){
        String str="\nCar rating 8.6/10 ☆";
        return str;
    }
    
    //METODO UNICO 
    @Override
    public void showPrice() {
        if(this.getUsed()==true){
            System.out.println("\nINFORMATION PRICE"+"\nThe price is: 210,000,000.00 COP");
        }else{
            System.out.println("\nINFORMATION PRICE"+"\nThe price is: 260,000,000.00 COP");
        }
    }
    
    //METODO UNICO 
    @Override
    public void showState() {
        if(this.getUsed()==true){
            System.out.println("\nMilage: 43,000km");
        }else{
            System.out.println("\nMilage: 0km");
        }
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nAcceleration 0 to 100: "+this.acceleration0to100+"\nMaterial: "+this.material;
        return str;
    }
    
    //METODO UNICO 
    public void sportMode(){
        System.out.println("\nSPORT MODE\nJust press a button and transform your journey into an experience"+"\nwhere speed meets perfection.");
    }
    
    //METODO UNICO 
    public void showAcceleration(){
        System.out.println("\nFeel time stand still as you move faster than ever before.");
    }
}
