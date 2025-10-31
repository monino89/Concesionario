
package Utility;
import VehicleCatalog.Vehicle;
import VehicleCatalog.Vehicle.Sedan;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;

public class UtilityFileReader {
    public static ArrayList<Vehicle> readSedan(String filePath){
        ArrayList<Vehicle> sedans=new ArrayList<>();
        String line="";
        Vehicle tempV=null;
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            line=reader.readLine();
            while(line!=null){
                String[] parts=line.split(",");
                if(parts.length==8){
                    sedans.add(new Sedan(parts[0].trim(),parts[1].trim(),parts[2].trim(),parts[3].trim(),parts[4].trim(),parts[5].trim(),parts[6].trim(),parts[7].trim()));
                }else{
                    System.out.println("Insuficiente data to create object");
                }
            }
            reader.close();
        }
    }
}
