import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner kb = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            printMenu();
            int choice = kb.nextInt();
            kb.nextLine();
            switch (choice) {
                case 1:                
                    System.out.print("Enter product name: ");
                    String newName = kb.nextLine();
                    System.out.print("Enter price: ");
                    double newPrice = Double.parseDouble(kb.nextLine());
                    System.out.print("Enter the unit: ");
                    String newUnit = kb.nextLine();
                    System.out.print("Enter quantity: ");
                    int newQty = Integer.parseInt(kb.nextLine());
                    Product newProduct = new Product(newName, newPrice, newQty, newUnit);
                    inventory.addProduct(newProduct);
                    break;
                case 2:
                    System.out.print("Okay! Next we need the name of the product you'd like removed from inventory: ");
                    String removeName = kb.nextLine();
                    inventory.removeProduct(removeName);
                    break;
                case 3:
                    System.out.print("Great! Please enter the name of the product you are looking for : "); 
                    String searchName = kb.nextLine();
                    Product found = inventory.searchProduct(searchName);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Alright, what is the name of the product you are trying to update? ");
                    String updateName = kb.nextLine();
                    System.out.println("Perfect! Are you trying to update the price or the quantity? ");
                    String selection = kb.nextLine();
                    if (selection.equalsIgnoreCase("price")){
                        System.out.print("Please enter the new price of " + updateName + ": ");
                        Double updatePrice = kb.nextDouble();
                        inventory.updatePrice(updateName, updatePrice);
                    }
                    else if (selection.equalsIgnoreCase("quantity")){
                        System.out.print("Please enter the new price of " + updateName + ": ");
                        Integer updateQuantity = kb.nextInt();
                        inventory.updateQuantity(updateName, updateQuantity);
                    }
                    break;
                case 5:
                    inventory.displayAllProducts();
                    break;
                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:

            }
        }
        kb.close();
    }  

    public static void printMenu(){
        System.out.print("=== Inventory Mangager ===\n");
        System.out.printf("%-10s\n", "1. Add Product");
        System.out.printf("%-10s\n", "2. Remove Product");
        System.out.printf("%-10s\n", "3. Search for Product");
        System.out.printf("%-10s\n", "4. Update Product");
        System.out.printf("%-10s\n", "5. Display All Products");
        System.out.printf("%-10s\n", "6. Exit");
        System.out.printf("%-10s", "Enter your choice: ");
    } 
}
