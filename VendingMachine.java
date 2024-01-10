import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 10.0;
        double cokePrice = 1.25;
        double pepsiPrice = 1.50;
        double milkPrice = 0.75;
        double waterPrice = 0.25;

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Items Available:");
        System.out.println("1. Coke - $" + cokePrice);
        System.out.println("2. Pepsi - $" + pepsiPrice);
        System.out.println("3. Milk - $" + milkPrice);
        System.out.println("4. Water - $" + waterPrice);

        System.out.println("Your current balance is: $" + balance);

        System.out.print("Enter the item number you wish to purchase: ");
        int itemNumber = scanner.nextInt();

        String item;
        double price;

        switch (itemNumber) {
            case 1:
                item = "Coke";
                price = cokePrice;
                break;
            case 2:
                item = "Pepsi";
                price = pepsiPrice;
                break;
            case 3:
                item = "Milk";
                price = milkPrice;
                break;
            case 4:
                item = "Water";
                price = waterPrice;
                break;
            default:
                System.out.println("Invalid item number. Please try again.");
                scanner.close();
                return;
        }

        if (balance >= price) {
            System.out.println("Dispensing " + item + "...");
            balance -= price;
            System.out.println("Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Please add more funds.");
        }

        scanner.close();
    }
}