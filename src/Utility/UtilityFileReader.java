
package Utility;
import VehicleCatalog.Vehicle;
import VehicleCatalog.Touring;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class UtilityFileReader {
    public static ArrayList<Vehicle> readTouring(String filePath){
        ArrayList<Vehicle> touring=new ArrayList<>();
        String line="";
        Vehicle tempV=null;
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=12){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                double cylinderCapacity=Double.parseDouble(parts[7].trim());
                String engineType=parts[8].trim();
                String brakeType=parts[9].trim();
                double autonomyKm=Double.parseDouble(parts[10].trim());
                double tankCapacity=Double.parseDouble(parts[11].trim());
                        touring.add(new Touring(brand,model,year,price,color,weight,used,cylinderCapacity,engineType,brakeType,autonomyKm,tankCapacity));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
        return touring;
    }
}
