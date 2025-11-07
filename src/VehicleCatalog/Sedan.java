
package VehicleCatalog;
import Validation.ValidationClass;
public class Sedan extends Car{
    
    private String typeSedan;
    private double trunkCapacity;
    
    public Sedan(){
        this.typeSedan="";
        this.trunkCapacity=0.0;
    }
    
    public Sedan(String brand, String model, int year, double price, String color, double weight, boolean used, int numDoor, int passengerCapacity, String fuelType, double power, String typeSedan, double trunkCapacity,int vehicleId){
        super(brand, model, year, price, color, weight, used, numDoor, passengerCapacity, fuelType, power,vehicleId);
        this.setTypeSedan(typeSedan);
        this.setTrunkCapacity(trunkCapacity);
    }
    
    public final void setTypeSedan(String typeSedan){
        ValidationClass.ValidateTypeSedan(typeSedan);
        this.typeSedan=typeSedan;
    }
        
    public final void setTrunkCapacity(double trunkCapacity){
        ValidationClass.ValidateTrunkCapacity(trunkCapacity);
        this.trunkCapacity=trunkCapacity;
    }
    
    public String getTypeSedan(){
        return this.typeSedan;
    }
    
    public double getTrunkSedan(){
        return this.trunkCapacity;
    }
    
    //METODO ABSTRACTO
    @Override
    public String assessment(){
        String str="\nCar rating 7.2/10 ☆";
        return str;
    }
    
    //METODO UNICO
    public void showPrice(){
        if(this.getUsed()==true){
            System.out.println("\nINFORMATION PRICE"+"\nThe price is: 52,000,000.00 COP");
        }else{
            System.out.println("\nINFORMATION PRICE"+"\nThe price is: 87,000,000.00 COP");
        }
    }
    //METODO UNICO
    @Override
    public void showState() {
        if(this.getUsed()==true){
            System.out.println("\nMilage: 95,000km");
        }else{
            System.out.println("\nMilage: 0km");
        }
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nType sedan: "+this.typeSedan+"\nTrunk capacity: "+this.trunkCapacity;
        return str;
    }
    
    //METODO UNICO
    public void showInformationComfort(){
        System.out.println("\nIts spacious interior, ergonomic seats and optimized suspension"+"\noffer you a smooth, quiet and enjoyable driving experience.");
    }
    
    //METODO UNICO 
    public void showTrunkCapacity(){
        System.out.println("\nWith its large carrying capacity and smart design, you can carry "+"\neverything you need without compromising comfort or style.");
    }
    
}

