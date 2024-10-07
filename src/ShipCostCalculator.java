import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // 1. Get item price from user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = in.nextDouble();

        double shippingCost;
        double totalCost;

        // 2. If the price is $100 or more, shipping is free
        if (price >= 100) {
            shippingCost = 0;
        } else {
            // 3. Otherwise, calculate shipping as 2% of the price
            shippingCost = price * 0.02;
        }

        // 4. Display the shipping cost and total price
        totalCost = price + shippingCost;
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Cost: $" + totalCost);
    }
}
