
package People;
import Validation.ValidationClass;

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
    
    protected final void setId(String id){
        ValidationClass.ValidateId(id);
        this.id = id;
    }
    
    protected final void setEmail(String email){
        ValidationClass.ValidateEmail(email);
        this.email = email;
    }
    
    protected final void setYearsOfExperience(int yearsOfExperience){
        ValidationClass.ValidateYearsExperience(yearsOfExperience);
        this.yearsOfExperience = yearsOfExperience;
    }
    
    protected String getId(){
        return this.id;
    }
    
    protected String getEmail(String email){
        return this.email;
    }
    
    protected int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    
    @Override
    
    public String toString(){
        String str = "Worker"+super.toString()+"\nEmployee id: " + this.id + "\nEmail: " + this.email + "\nYears of Experience: " + this.yearsOfExperience;
        return str;
    }
    
}
