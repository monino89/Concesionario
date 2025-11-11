
package People;

import Validation.ValidationClass;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;


public class Client extends Person {
    
    private boolean newClient;
    private ArrayList <Vehicle> shoppingList;
    private PaymentMethod paymentMethod;
    
    public Client(){
        
    }
    
    public Client(String name, String lastName1, String lastName2, int age, String dni, String phone, boolean newClient){
        super(name, lastName1, lastName2, age, dni, phone);
        this.shoppingList = new ArrayList<>();
        this.paymentMethod = new PaymentMethod();
    }
    
    protected final void setNewClient(boolean newClient){
        this.newClient = newClient;
    }
    
    protected boolean getNewClient(){
        return this.newClient;
    }
    
    public void addShoppingList(Vehicle vehicle){
        this.shoppingList.add(vehicle);
    }

    @Override
    
    public String toString(){
        String str = super.toString();
        if (this.shoppingList.size()>0){
            str += "Shopping list: \n";
            for(Vehicle a: this.shoppingList){
                str += a.toString() + "\n";
                if (paymentMethod.getCash() == true){
                   str += "\nVehicle price after discount: " + a.getPrice()*paymentMethod.getCashDiscount(); 
                } else {
                    str += "\nVehicle interest per month: " + a.getPrice()*paymentMethod.getInterest();
                }
            }
        } else {
            str += "The customer has not added vehicles to their shopping list.\n";
        }
        return str;
       
    }
    
    
    public void thankYouMessage(){
        if (newClient == true){
            System.out.println("\nPlease thanks the customer for being a new client.");
            
        } else {
            System.out.println("\nPlease thanks the customer for being a loyal client.");
        }
        
    }
    
}
