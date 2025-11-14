
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
        String str = "Client "+super.toString();
        if (newClient == true){
            str += "\nNew client.";
        } else {
            str += "\nPrevious client.";
        }
        str+="\nClient id: "+this.clientId;
        return str;
    }
    
    public void thankYouMessage(){
        System.out.println("");
    }
    
}
