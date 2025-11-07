package VehicleCatalog;
import Validation.ValidationClass;
public class Touring extends MotorBike{
    
    private double autonomyKm;
    private double tankCapacity;
    
    public Touring(){
        this.autonomyKm=0.0;
        this.tankCapacity=0.0;
    }
    
    public Touring(String brand, String model, int year, double price, String color, double weight, boolean used, double cylinderCapacity, String engineType, String brakeType, double autonomyKm, double tankCapacity){
        super(brand, model, year, price, color, weight, used, cylinderCapacity, engineType, brakeType);
        this.setAutonomyKm(autonomyKm);
        this.setTankCapacity(tankCapacity);
    }
    
    public final void setAutonomyKm(double autonomyKm){
        ValidationClass.ValidationAutonomyKm(autonomyKm);
        this.autonomyKm=autonomyKm;
    }
    
    public final void setTankCapacity(double tankCapacity){
        ValidationClass.ValidationTankCapacity(tankCapacity);
        this.tankCapacity=tankCapacity;
    }
    
    public double getAutonomyKm(){
        return this.autonomyKm;
    }
    
    public double getTankCapacity(){
        return this.tankCapacity;
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nRange in kilometers: "+this.autonomyKm+"\nTank Capacity: "+this.tankCapacity;
        return str;
    }
    
    //METODO UNICO 
    public void routeInformation(){
        System.out.println("\nDiscover miles of landscapes, curves, and destinations-always knowing where your adventure will take you."
                + "\nPlan your journey, know the key stops, and get ready to ride without setbacks."
                + "\nBecause on every route, the real goal is to enjoy the ride."
                + "\nStart your engine, hit the throttle, and let the road tell its story!");
    }
    
    //METODO ABSTRACTO
    @Override
    public String assessment(){
        String str="\nMotorcycle rating 8/10 ☆";
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
            System.out.println("\nMilage: 100,000km");
        }else{
            System.out.println("\nMilage: 0km");
        }
    }
}
