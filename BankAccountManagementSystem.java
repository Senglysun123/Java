import java.util.Scanner;

public class BankAccountManagementSystem {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 1000.0, "John Doe", "john@example.com", "123-456-7890");
        
        System.out.println("Initial Account Details:");
        myAccount.displayAccountDetails();
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        myAccount.depositFunds(depositAmount);
                    } else {
                        System.out.println("Invalid amount for deposit.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0) {
                        myAccount.withdrawFunds(withdrawAmount);
                    } else {
                        System.out.println("Invalid amount for withdrawal.");
                    }
                    break;
                case 3:
                    System.out.println("Account Details:");
                    myAccount.displayAccountDetails();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Deposit Funds");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. View Account Details");
        System.out.println("4. Exit");
    }
}
