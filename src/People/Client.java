
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
    public int getClientId(){
        return this.clientId;
    }
    public void addShoppingList(Vehicle vehicle){
        this.shoppingList.add(vehicle);
    }

    @Override
    public String toString() {
    StringBuilder str = new StringBuilder(super.toString());
    str.append("\nClient Type: ").append(newClient ? "New Client" : "Loyal Client");
    str.append("\nClient ID: ").append(clientId);
    
    if (this.shoppingList.size() > 0) {
        str.append("\nShopping List:\n");
        for (Vehicle vehicle : this.shoppingList) {
            str.append(vehicle.toString()).append("\n");
            if (paymentMethod.getCash()) {
                str.append("Vehicle price after discount: ")
                   .append(vehicle.getPrice() * (1 - paymentMethod.getCashDiscount()))
                   .append("\n");
            } else {
                str.append("Vehicle interest per month: ")
                   .append(vehicle.getPrice() * paymentMethod.getInterest())
                   .append("\n");
            }
        }
    } else {
        str.append("\nThe customer has not added vehicles to their shopping list.");
    }
    return str.toString();
}
    
    
    public void thankYouMessage(){
        if (newClient == true){
            System.out.println("\nPlease thanks the customer for being a new client.");
            
        } else {
            System.out.println("\nPlease thanks the customer for being a loyal client.");
        }
        
    }
    
}
