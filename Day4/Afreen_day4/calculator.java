public class calculator{
    public static double calculateDiscount(double originalPrice, double discountPercentage) {
        return originalPrice * (discountPercentage / 100);
    }
    public static double calculateTax(double amount, double taxRate) {
        return amount * (taxRate / 100);
    }
    public static double calculateFinalPrice(double itemPrice, double discountPerc, double taxRate) {
        double discount = calculateDiscount(itemPrice, discountPerc);
        double priceAfterDiscount = itemPrice - discount;
        double tax = calculateTax(priceAfterDiscount, taxRate);
        return priceAfterDiscount + tax;
    }
    public static void main(String[] args) {
        double itemPrice = 1500.0;
        double discountPerc = 0.0;
        double taxRate = 18.0;
        double finalPrice = calculateFinalPrice(itemPrice, discountPerc, taxRate);
        System.out.println("Final Price: Rs " + finalPrice);
    }
}
