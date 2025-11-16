
package People;

import Validation.ValidationClass;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;


public class Client extends Person {
    
    private boolean newClient;
    private ArrayList <Vehicle> shoppingList;
    private PaymentMethod paymentMethod;
    private int clientId;
    
    public Client(){
        
    }
    
    public Client(String name, String lastName1, String lastName2, int age, String dni, String phone, boolean newClient,int clientId){
        super(name, lastName1, lastName2, age, dni, phone);
        this.shoppingList = new ArrayList<>();
        this.paymentMethod = new PaymentMethod();
        this.setNewClient(newClient);
        this.clientId=clientId;
    }
    
    public final void setNewClient(boolean newClient){
        this.newClient = newClient;
    }
    
    public boolean getNewClient(){
        return this.newClient;
    }
    public int getClientId(){
        return this.clientId;
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
        str+="\nClient id: "+this.clientId;
        str+="\n\tCurrent shopping list: ";
        for(Vehicle v:this.shoppingList){
            str+=v.toString();
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
