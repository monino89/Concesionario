
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
    
    public final void setNewClient(boolean newClient){
        ValidationClass.ValidateNewClient(newClient);
        this.newClient = newClient;
    }
    
    public boolean getNewClient(){
        return this.newClient;
    }
    
    public void addShoppingList(Vehicle vehicle){
        this.shoppingList.add(vehicle);
    }

    @Override
    
    public String toString(){
        String str = null;
        if (newClient == true){
            str += "\nNew client.";
        } else {
            str += "\nPrevious client.";
        }
        
        str += "";
        return str;
    }
    
    public void thankYouMessage(){
        System.out.println("");
    }
    
}
