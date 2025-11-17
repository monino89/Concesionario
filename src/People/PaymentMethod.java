package People;

import Validation.ValidationClass;

public class PaymentMethod {
    private boolean cash;
    private double cashDiscount;
    private double interest;
    
    public PaymentMethod() {
        this.cash = true;
        this.cashDiscount = 0.1; // 10% discount for cash
        this.interest = 0.05; // 5% interest per month
    }
    
    public PaymentMethod(boolean cash, double cashDiscount, double interest) {
        this.setCash(cash);
        this.setCashDiscount(cashDiscount);
        this.setInterest(interest);
    }
    
    public final void setCash(boolean cash) {
        this.cash = cash;
    }
    
    public final void setCashDiscount(double cashDiscount) {
        ValidationClass.ValidateCashDiscont(cashDiscount);
        this.cashDiscount = cashDiscount;
    }
    
    public final void setInterest(double interest) {
        ValidationClass.ValidateInterest(interest);
        this.interest = interest;
    }
    
    public boolean getCash() {
        return cash;
    }
    
    public double getCashDiscount() {
        return cashDiscount;
    }
    
    public double getInterest() {
        return interest;
    }
    
    @Override
    public String toString() {
        return "PaymentMethod{" +
                "cash=" + cash +
                ", cashDiscount=" + cashDiscount +
                ", interest=" + interest +
                '}';
    }
}