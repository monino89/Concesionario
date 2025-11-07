
package People;


public class Worker extends Person {
    
    private String id;
    private String email;
    private int yearsOfExperience;
    
    public Worker(){
        
    }
    
    public Worker(String name, String lastName1, String lastName2, int age, String dni, String phone, String id, String email, int yearsOfExperience){
        super(name, lastName1, lastName2, age, dni, phone);
        this.setId(id);
        this.setEmail(email);
        this.setYearsOfExperience(yearsOfExperience);
    }
    
    public final void setId(String id){
        this.id = id;
    }
    
    public final void setEmail(String email){
        this.email = email;
    }
    
    public final void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getEmail(String email){
        return this.email;
    }
    
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    
    @Override
    
    public String toString(){
        String str = "\nEmployee id: " + this.id + "\nEmail: " + this.email + "\nYears of Experience: " + this.yearsOfExperience;
        return str;
    }
    
    public String availableWorkers(){
        String str = "";
        return str;
    }
}
