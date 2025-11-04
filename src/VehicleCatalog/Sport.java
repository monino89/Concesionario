package VehicleCatalog;
import Validation.ValidationClass;
public class Sport extends MotorBike{
    
    private String chassisMaterial;
    private double aceleration0to100;
    
    public Sport(){
      this.chassisMaterial="";
      this.aceleration0to100=0.0;
    }
    
    public Sport(String band, String model, int year, double price, String color, double weight, boolean used, double cylinderCapacity, String engineType, String brakeType, String chassisMaterial, double aceleration0to100){
        super(band, model, year, price, color, weight, used, cylinderCapacity, engineType, brakeType);
        this.setChassisMaterial(chassisMaterial);
        this.setAceleration0to100(aceleration0to100);
    }
    
    public final void setChassisMaterial(String chassisMaterial){
        ValidationClass.ValidationChassisMaterial(chassisMaterial);
        this.chassisMaterial=chassisMaterial;
        
    } 
    
    
    public final void setAceleration0to100(double aceleration0to100){
        ValidationClass.ValidationAceleration0to100(aceleration0to100);
        this.aceleration0to100=aceleration0to100;
    }
    
    public String getChassisMaterial(){
        return this.chassisMaterial;
    }
    
    public double getAceleration0to100(){
        return this.aceleration0to100;
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nChassis Material: "+this.chassisMaterial+"\nTime from to 100: "+this.aceleration0to100;
        return str;
    }
    
    public String avaliableModes(){
        String str="\nDRIVING MODES"+"\nSport: Maximum response and pure adrenaline for those who love speed."+
                "\nRain: Total control and safety even in lowgrip conditions."+
                "\nRoad: Perfect balance between power, comfort, and efficiency for everyday use.";
        return str;
    }

    @Override
    public String assessment() {
        String str="\nMotorcycle rating 9.8/10 ☆";
        return str;
    }

    @Override
    public void showPrice() {
        if(this.getUsed()==true){
            System.out.println("\nINFORMATION PRICE"+"\nThe price is: 45,000,000.00 COP");
        }else{
            System.out.println("\nINFORMATION PRICE"+"\nThe price is: 75,000,000.00 COP");
        }
    }

    @Override
    public void showState() {
        if(this.getUsed()==true){
            System.out.println("\nMilage: 200,000km");
        }else{
            System.out.println("\nMilage: 0km");
        }
    }
}
