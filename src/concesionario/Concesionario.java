
package concesionario;

import People.Client;
import People.Person;
import Utility.Menu;
import Utility.UtilityFileReader;
import VehicleCatalog.Touring;
import VehicleCatalog.MotorBike;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    public static void main(String[] args) {
        //crear la arraylist vehicles de todos los vehiculos leyendo los archivos, touring retorna arraylist y el resto solo agregan a la arraylist
        ArrayList<Vehicle> vehicles=new ArrayList<>(UtilityFileReader.readTouring("./touring.txt"));
        ArrayList<Person> people=new ArrayList<>(UtilityFileReader.readClient("./client.txt"));
        UtilityFileReader.readSport("./sport.txt", vehicles);
        UtilityFileReader.readDualSport("./dualsport.txt", vehicles);
        UtilityFileReader.readSedan("./sedan.txt", vehicles);
        UtilityFileReader.readCarSport("./carsport.txt", vehicles);
        UtilityFileReader.readPickup("./pickup.txt", vehicles);
        UtilityFileReader.readHyperMotorbike("./hypermotorbike.txt", vehicles);
        UtilityFileReader.readHyperCar("./hypercar.txt", vehicles);
        //
        Menu.printMenu();
        UtilityFileReader.createRelations("./relations.txt", vehicles, people);
        for(Person p:people){
            System.out.println(p.toString());
        }

        //crear la lista de clientes, client retorna arraylist y el resto agregan a la lista
        ArrayList<Client> clients = new ArrayList<>(UtilityFileReader.readClient("./client.txt"));
        UtilityFileReader.readSeller("./sellers.txt", people);
        UtilityFileReader.readMechanic("./mechanics.txt", people);

        
        //CODIGO PARA EL MENU
        int option, addVehicleOpt;
        boolean stop=false;
        
        //Clase Client
        String name, lastName1, lastName2, dni, phone;
        int age, clientId;
        boolean newClient;
        
        //Clase Vehicle
        String brand, model, color;
        int year, vehicleId;
        double price, weight;
        boolean used;
        
        Scanner scanner= new Scanner(System.in);
        
        try{
            while(!stop){
                Menu.printMenu();
                System.out.println("Please type the desired option: ");
                option = scanner.nextInt();
                scanner.nextLine();
                
                switch(option){
                    case 1:
                        //Print vehicles information
                        System.out.println("VEHICLE INFORMATIONS");
                        for(Vehicle v: vehicles){
                            System.out.println(v.toString());
                        }
                        break;
                    case 2:
                        //Print Client information
                        System.out.println("\nCLIENTS INFORMATION");
                        for(Person p: people){
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        //Modyfi an existing client
                        Client tempC=null;
                        System.out.println("Please type the id of the client to modify");
                        clientId=scanner.nextInt();
                        scanner.nextLine();
                        for(Client c: clients){
                            if(clientId==c.getClientId()){
                                tempC=c;
                                break;
                            }
                        }
                        if(tempC!=null){
                            System.out.println("Please type the new name: ");
                            name=scanner.nextLine();
                            tempC.setName(name);
                            System.out.println("Please type the new first name: ");
                            lastName1=scanner.nextLine();
                            tempC.setLastName1(lastName1);
                            System.out.println("Please type the new second surname: ");
                            lastName2=scanner.nextLine();
                            tempC.setLastName2(lastName2);
                            System.out.println("Please type the new age: ");
                            age=scanner.nextInt();
                            tempC.setAge(age);
                            scanner.nextLine();
                            System.out.println("Please type the new dni: ");
                            dni=scanner.nextLine();
                            tempC.setDni(dni);
                            System.out.println("Please type the new phone: ");
                            phone=scanner.nextLine();
                            tempC.setPhone(phone);
                            System.out.println("Please type the new state: ");
                            newClient=scanner.nextBoolean();
                            tempC.setNewClient(newClient);
                            System.out.println("Type 1 to add vehicle, 0 otherwise");
                            addVehicleOpt=scanner.nextInt();
                            scanner.nextLine();
                            
                            if(addVehicleOpt==1){
                                Vehicle tempV=null;
                                System.out.println("Please type Vehicle ID: ");
                                vehicleId=scanner.nextInt();
                                for(Vehicle v: vehicles){
                                    if(vehicleId==v.getVehicleId()){
                                        tempV=v;
                                        break;
                                    }
                                }
                                if(tempV!=null){
                                    tempC.addShoppingList(tempV);
                                }else{
                                    System.out.println("Vehicle not found");
                                }
                            }
                        }else{
                            System.out.println("Vehicle not found");
                        }
                        break;
                        
                    case 4:
                        //Create a new client
                        System.out.println("Please type the name: ");
                        name=scanner.nextLine();
                        System.out.println("Please type the first name: ");
                        lastName1=scanner.nextLine();
                        System.out.println("Please type the second name: ");
                        lastName2=scanner.nextLine();
                        System.out.println("Please type the age: ");
                        age=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Please type the dni: ");
                        dni=scanner.nextLine();
                        System.out.println("Please type the phone: ");
                        phone=scanner.nextLine();
                        System.out.println("Please type the state: ");
                        newClient=scanner.nextBoolean();
                        System.out.println("Please type the client ID");
                        clientId=scanner.nextInt();
                        scanner.nextLine();
                        clients.add(new Client(name, lastName1, lastName2, age, dni, phone, newClient, clientId));
                        break;
                        
                    case 5:
                        //Create report file
                        UtilityFileReader.createReport("./SystemReport.txt", vehicles, people);
                        break;
                        
                    case 6:
                        stop=true;
                        break;
                        
                    default:
                        System.out.println("Invalid option");
                        break;
                        
                }
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
