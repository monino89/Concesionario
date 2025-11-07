
package VehicleCatalog;
public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private double weight;
    private boolean used;
    private int vehicleId;
    
    public Vehicle(){
        this.brand="";
        this.model="";
        this.year=0;
        this.price=0;
        this.color="";
        this.weight=0;
        this.used=false;
        this.vehicleId=0;
    }
    public Vehicle(String brand,String model,int year,double price,String color,double weight,boolean used,int vehicleId){
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
        this.setPrice(price);
        this.setColor(color);
        this.setWeight(weight);
        this.setUsed(used);
        this.vehicleId=vehicleId;
    }
    
    //
    
    public final void setBrand(String brand){
        this.brand=brand;
    }
    public final void setModel(String model){
        this.model=model;
    }
    public final void setYear(int year){
        this.year=year;
    }
    public final void setPrice(double price){
        this.price=price;
    }
    public final void setColor(String color){
        this.color=color;
    }
    public final void setWeight(double weight){
        this.weight=weight;
    }
    public final void setUsed(boolean used){
        this.used=used;
    }
    public String getBrand(){
        return this.getBrand();
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
       return this.year;
    }
    public double getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getUsed(){
        return this.used;
    } 
    @Override
    public String toString(){
        String str="\nId: "+this.vehicleId+"\nBrand: "+this.brand+"\nModel: "+this.model+"\nYear: "+this.year+"\nPrice: "+this.price+"\nColor: "+this.color+"\nWeight: "+this.weight;
        if(this.used){
            str+="\nThe vehicle is used";
        }else{
            str+="\nThe vehicle is brand new";
        }
        return str;
    }
    public abstract void showPrice();
    public abstract void showState();
}
