
package Utility;

import java.util.Date;
import java.util.List;

public interface Interfaz {

    String formatDate(Date date, String format);
    
    boolean validateString(String text);
    
    double calculateFinalPrice(double basePrice, double discount, double interest, boolean isCash);
    
    double roundValue(double value, int decimals);
    
    String generateUniqueCode();
    
    void displayList(List<?> list);
    
}
