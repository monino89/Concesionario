package People;
import Validation.ValidationClass;

public class Person {
    
    private String name;
    private String lastName1;
    private String lastName2;
    private int age;
    private String dni;
    private String phone;
    
    public Person(){
        
    }
    
    public Person(String name, String lastName1, String lastName2, int age, String dne, String phone){
        this.setName(name);
        this.setLastName1(lastName1);
        this.setLastName2(lastName2);
        this.setAge(age);
        this.setDni(dni);
        this.setPhone(phone);
    }
    
    public final void setName(String name){
        ValidationClass.validateName(name);
        this.name = name;
    }
    
    public final void setLastName1(String lastName1){
        ValidationClass.validateLastName1(lastName1);
        this.lastName1 = lastName1;
    }
    
    public final void setLastName2(String lastName2){
        ValidationClass.validateLastName2(lastName2);
        this.lastName2 = lastName2;
    }
    
    public final void setAge(int age){
        ValidationClass.validateAge(age);
        this.age = age;
    }
    
    public final void setDni(String dni){
        ValidationClass.validateDni(dni);
        this.dni = dni;
    }
    
    public final void setPhone(String phone){
        ValidationClass.validatePhone(phone);
        this.phone = phone;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastName1(){
        return this.lastName1;
    }
    
    public String getLastName2(){
        return this.lastName2;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    @Override
    public String toString(){
        String str = "Name: " + this.name + " " + this.lastName1 + " " + this.lastName2
                + "\nAge: " + this.age + "\nDni: " + this.dni + "\nPhone number: " + this.phone;
        return str;
    }
}
