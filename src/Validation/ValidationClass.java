
package Validation;


public final class ValidationClass {
    
    private ValidationClass(){}
    
    public static void validateName(String name){
        if(!name.matches("[a-z A-Z]+")){
            throw new IllegalArgumentException("The name is not valid");
        }
    }
    
    public static void validateLastName1(String lastName1){
        if(!lastName1.matches("[a-z A-Z]+")){
            throw new IllegalArgumentException("The last name is not valid");
        }
    }
    
    public static void validateLastName2(String lastName2){
        if(!lastName2.matches("[a-z A-Z]+")){
            throw new IllegalArgumentException("The last name is not valid");
        }
    }
    
    public static void validateAge(int age){
        if(age<0){
            throw new IllegalArgumentException("The age must be positive");
        }
    }
    
    public static void validateDni(String dni){
        if( dni == null || !dni.matches("\\d{8,10}")){
            throw new IllegalArgumentException("The dni is not valid.");
        }
    }
    
    public static void validatePhone(String phone){
        if( phone == null || !phone.matches("\\d{10}")){
            throw new IllegalArgumentException("The phone number is not valid.");
        }
    }
    
    public static void validateCode(String code){
        if( code == null || !code.matches("\\d{7}")){
            throw new IllegalArgumentException("The employee code is not valid.");
        }
    }
    
    public static void ValidateYearsExperience(int yearsExperience){
        if(yearsExperience<0){
            throw new IllegalArgumentException("The years of experience must be positive.");
        }
    }
    
//          VALIDACION CLASE_MOTORBIKE
    
    public static void ValidateCylinderCapacity(double cylinderCapacity){
        if(cylinderCapacity<0.0){
            throw new IllegalArgumentException("The cylinder must be greater than zero.");
        }
    }
    
    public static void ValidateEngineType(String engineType){
        if(engineType.isBlank()||engineType.isEmpty()||engineType.matches("[a-z A-Z 0-9]+")){
        }else{
            throw new IllegalArgumentException("The engine type has invalid characters.");
        }
    }
    
    public static void ValidateBrakeType(String brakeType){
        if(brakeType.isBlank()||brakeType.isEmpty()||brakeType.matches("[a-z A-Z 0-9]+")){
        }else{
            throw new IllegalArgumentException("The type of brakes has invalid characters.");
        }
    }
    
    //      VALIDACION CLASE_TOURING
    
    public static void ValidationAutonomyKm(double autonomyKm){
        if(autonomyKm<0.0){
            throw new IllegalArgumentException("The autonomy Km must be greater than zero. ");
        }
    }
    
    public static void ValidationTankCapacity(double tankCapacity){
        if(tankCapacity<0.0){
            throw new IllegalArgumentException("The tank capacity be greater than zero. ");
        }
    }
}
