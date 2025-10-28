
package CatalogoVehiculos;
public class Vehiculo {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private double weight;
    private boolean used;
    
    public Vehiculo(){
        this.brand="";
        this.model="";
        this.year=0;
        this.price=0;
        this.color="";
        this.weight=0;
        this.used=false;
    }
    public Vehiculo(String brand,String model,int year,double price,String color,double weight,boolean used){
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
        this.setPrice(price);
        this.setColor(color);
        this.setWeight(weight);
        this.setUsed(used);
    }
    
    //
    
    
}
