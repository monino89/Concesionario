
package People;
import Validation.ValidationClass;

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
    
    public final void setCash(boolean cash){
        this.cash = cash;
    }
    
    public final void setCashDiscount(double cashDiscount){
        ValidationClass.ValidateCashDiscont(cashDiscount);
        this.cashDiscount = cashDiscount;
    }
    
    public final void setInterest(double interest){
        ValidationClass.ValidateInterest(interest);
        this.interest = interest;
    }
    
    public boolean getCash(){
        return this.cash;
    }
    
    public double getCashDiscount(){
        return this.cashDiscount;
    }
    
    public double getInterest(){
       return this.interest;     
    }
    
    
}
