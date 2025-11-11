
package Validation;


public final class ValidationClass {
    
    private ValidationClass(){}
    
    
    //      VALIDACION CLASE_PERSON
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
    
    //      VALIDACION CLASE_SPORT
    
    public static void ValidationChassisMaterial(String chassisMaterial){
        if(chassisMaterial.isBlank()||chassisMaterial.isEmpty()||chassisMaterial.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The chassis material has invalid characters. ");
        }
    }
    
    public static void ValidationAcceleration0to100(double acceleration0to100){
        if(acceleration0to100<0.0){
            throw new IllegalArgumentException("The aceleration must be greater than zero. ");
        }
    }
    
    //      VALIDACION CLASE_DUALSPORT
    
    public static void ValidationSeatHeight(double seatHeight){
        if(seatHeight<0.0){
            throw new IllegalArgumentException("The seat height must be greater than zero. ");
        }
    }
    
    public static void ValidationTireType(String tireType){
        if(tireType.isBlank()||tireType.isEmpty()||tireType.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The tire type has invalid characters. ");
        }
    }
    
    //      VALIDACION CLASE_HYPERMOTORBIKE
    
    public static void ValidateMaxSpeed(double maxSpeed){
        if(maxSpeed<0.0){
            throw new IllegalArgumentException("The max speed must be greater than zero. ");
        }
    }
    
    public static void ValidateDownForce(int downForce){
        if(downForce<0){
            throw new IllegalArgumentException("The downforce must be greater than zero. ");
        }
    }
    
    //      VALIDACION CLASE_CAR
    
    public static void ValidateNumDoor(int numDoor){
        if(numDoor<0){
            throw new IllegalArgumentException("The number of doors must be grater than zero. ");
        }
    }
    
    public static void ValidatePassengerCapacity(int passengerCapacity){
        if(passengerCapacity<0){
            throw new IllegalArgumentException("The passenger capacity must be grater than zero. ");
        }
    }
    
    public static void ValidateFuelType(String fuelType){
        if(fuelType.isBlank()||fuelType.isEmpty()||fuelType.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The fuel type has invalid characters. ");
        }
    }
    
    public static void ValidatePower(double power){
        if(power<0.0){
            throw new IllegalArgumentException("The power must be grater than zero. ");
        }
    }
    
    //      VALIDACION CLASE_SEDAN
    
    public static void ValidateTypeSedan(String typeSedan){
        if(typeSedan.isBlank()||typeSedan.isEmpty()||typeSedan.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The type sedan has invalid characters. ");
        }
    }
    
    public static void ValidateTrunkCapacity(double trunkCapacity){
        if(trunkCapacity<0.0){
            throw new IllegalArgumentException("The trunk capacity must be grater than zero. ");
        }
    }
    
    //      VALIDACION CLASE_CARSPORT
    // Se reutilizo la validacion de acceleration0to100 y se encuentra en la seccion SPORT
    
    public static void ValidateMaterial(String material){
        if(material.isBlank()||material.isEmpty()||material.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The material has invalid characters. ");
        }
    }
    
    //      VALIDACION CLASE_PICKUP
    
    public static void ValidateLoadCapacity(double loadCapacity){
        if(loadCapacity<0.0){
            throw new IllegalArgumentException("The load capacity must be grater than zero. ");
        }
    }
    
    public static void ValidatePlateSize(double plateSize){
        if(plateSize<0.0){
            throw new IllegalArgumentException("The plate size must be grater than zero. ");
        }
    }
    
    public static void ValidateTraction(String traction){
        if(traction.isBlank()||traction.isEmpty()||traction.matches("[a-z A-Z 0-9]+")==false){
            throw new IllegalArgumentException("The traction has invalid characters. ");
        }
    }
    
    //      VALIDACION CLASE_HYPERCAR
    //se reutilizo la validacion de downForce y se encuentra en la seccion HyperMotorbike
    
    public static void ValidateHybridPropulsion(String hybridPropulsion){
        if(hybridPropulsion.isBlank()||hybridPropulsion.isEmpty()||hybridPropulsion.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The hybrid propulsion has invalid cahracters. ");
        }
    }
    
    
    //      VALIDACION CLASE_WORKER
    
    public static void ValidateId(String id){
        if(id.isBlank()||id.isEmpty()||id.matches("[0-9]+")){
            throw new IllegalArgumentException("The Id has invalid characters. ");
        }
    }
    
    public static void ValidateEmail(String email){
        if(email.isBlank()||email.isEmpty()||email.matches("^[_a-z 0-9-]+(\\.[_a-z 0-9-]+)*@[a-z 0-9-]+(\\.[a-z 0-9-]+)*(\\.[a-z]{2,})$")){
            throw new IllegalArgumentException("The email has invalid characters. ");
        }
    }
    
    public static void ValidateYearsOfExperience(int yearsOfExperience){
        if(yearsOfExperience<0){
            throw new IllegalArgumentException("The years of experience must be grater than zero. ");
        }
    }

    
    
    //      VALIDACION CLASE_VEHICLE
    
    public static void ValidateBrand(String brand){
        if(brand.isBlank()||brand.isEmpty()||brand.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The brand has invalid characters. ");
        }
    }
    
    public static void ValidateModel(String model){
        if(model.isBlank()||model.isEmpty()||model.matches("[a-z A-Z 0-9]+")==false){
            throw new IllegalArgumentException("The model has invalid characters. ");
        }
    }
    
    public static void ValidateYear(int year){
        if(year<1885){
            throw new IllegalArgumentException("The year must be grater than 1885. ");
        }
    }
    
    
    public static void ValidatePrice(double price){
        if(price<0.0){
            throw new IllegalArgumentException("The price must be grater than zero. ");
        }
    }
    
    public static void ValidateColor(String color){
        if(color.isBlank()||color.isEmpty()||color.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The color has invalid characters. ");
        }
    }
    
    public static void ValidateWeight(double weight){
        if(weight<0.0){
            throw new IllegalArgumentException("The weight must be grater than zero. ");
        }
    }
    

    
    //      VALIDACION CLASE_SELLER
    
    public static void ValidateSalesMade(int salesMade){
        if(salesMade<0){
            throw new IllegalArgumentException("The sales made must be grater than zero. ");
        }
    }
    
    //      VALIDACION CLASE_MECHANIC
    
    public static void ValidateSpecialTy(String specialty){
        if(specialty.isBlank()||specialty.isEmpty()||specialty.matches("[a-z A-Z]+")==false){
            throw new IllegalArgumentException("The specialty has invalid characters. ");
        }
    }
    
    //      VALIDACION CLASE_PAYMENTMETHOD
    
    
    public static void ValidateCashDiscont(double cashDiscont){
        if(cashDiscont<0.0){
            throw new IllegalArgumentException("The cashdiscont must be grater than zero. ");
        }
    }
    
    public static void ValidateInterest(double interest){
        if(interest<0.0){
            throw new IllegalArgumentException("The interest must be grater than zero. ");
        }
    }
}
