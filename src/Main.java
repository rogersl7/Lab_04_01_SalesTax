public class Main {
    public static void main(String[] args) {
    System.out.print("What is the price of your item? ");
    // input itemPrice
    int itemPrice = 76;
    double priceTax = .05 * itemPrice;
    double totalCost = itemPrice + priceTax;
    System.out.print("With sales tax, the price of your item is now " +  totalCost );
}

}