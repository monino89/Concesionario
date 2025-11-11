
package Utility;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class UtilityImpl implements Interfaz {

    @Override
    public String formatDate(Date date, String format) {
        if (date == null) return "N/A";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    @Override
    public boolean validateString(String text) {
        return text != null && !text.trim().isEmpty();
    }

    @Override
    public double calculateFinalPrice(double basePrice, double discount, double interest, boolean isCash) {
        double result = basePrice;
        if (isCash) result -= basePrice * (discount / 100);
        else result += basePrice * (interest / 100);
        return roundValue(result, 2);
    }

    @Override
    public double roundValue(double value, int decimals) {
        double factor = Math.pow(10, decimals);
        return Math.round(value * factor) / factor;
    }

    @Override
    public String generateUniqueCode() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    @Override
    public void displayList(List<?> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            list.forEach(System.out::println);
        }
    }
}
