
package People;
import Validation.ValidationClass;
import VehicleCatalog.Vehicle;
class PaymentMethod {
    
    private boolean cash;
    private double cashDiscount;
    private double interest;
    
    public PaymentMethod(){
        
    }
    
    public PaymentMethod(boolean cash, double cashDiscount, double interest){
        this.setCash(cash);
        this.setCashDiscount(cashDiscount);
        this.setInterest(interest);
    }
    
    protected final void setCash(boolean cash){
        this.cash = cash;
    }

    protected final void setCashDiscount(double cashDiscount){
        ValidationClass.ValidateCashDiscont(cashDiscount);
        this.cashDiscount = cashDiscount;
    }
    
    protected final void setInterest(double interest){
        ValidationClass.ValidateInterest(interest);
        this.interest = interest;
    }
    
    protected boolean getCash(){
        return this.cash;
    }
    
    protected double getCashDiscount(){
        return this.cashDiscount;
    }
    
    protected double getInterest(){
       return this.interest;     
    }
    
    public void calculatePrice(){
        if (this.cash == true){
            this.cashDiscount = 0.9;
        } else {
            this.interest = 0.03;
        }
    }
}
