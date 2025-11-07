
package VehicleCatalog;
import Validation.ValidationClass;
public class DualSport extends MotorBike{
    
    private double seatHeight;
    private String tireType;
    
    public DualSport(){
        this.seatHeight=0.0;
        this.tireType="";
    }
    
    public DualSport(String band, String model, int year, double price, String color, double weight, boolean used, double cylinderCapacity, String engineType, String brakeType, double seatHeight, String tireType){
        super(band, model, year, price, color, weight, used, cylinderCapacity, engineType, brakeType);
        this.setSeatHeight(seatHeight);
        this.setTireType(tireType);
    }
    
    public final void setSeatHeight(double seatHeight){
        ValidationClass.ValidationSeatHeight(seatHeight);
        this.seatHeight=seatHeight;
    }
    
    public final void setTireType(String tireType){
        ValidationClass.ValidationTireType(tireType);
        this.tireType=tireType;
    }
    
    public double getSeatHeight(){
        return this.seatHeight;
    }
    
    public String getTireType(){
        return this.tireType;
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"\nSeat position: "+this.seatHeight+"\nTire type: "+this.tireType;
        return str;
    }
    
    public void landCapacity(){
        System.out.println("\nTERRAIN FOR DRIVING"+"\nAsphalt: Smoothness and stability for your urban journeys or long trips."+
                "\nMixed terrain: Perfect balance between comfort and traction for unpredictable routes."
                +"\nOff-Road: Strength, suspension, and grip for those seeking adventure beyond the pavament");
    }

    //METODO ABSTRACTO
    @Override
    public String assessment() {
        String str="\nMotorcycle rating 7.4/10 ☆";
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
            System.out.println("\nMilage: 154,000km");
        }else{
            System.out.println("\nMilage: 0km");
        }
    }
    
    
}
