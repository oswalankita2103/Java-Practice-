import java.util.*;

// Product class
class InventorySystem {
    int id;
    String name;
    int quantity;
    double price;

    InventorySystem(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Quantity: " + quantity + ", Price: " + price);
    }
}

// Main Inventory System
public class InventorySystem {
    static ArrayList<InventorySystem> inventory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Quantity");
            System.out.println("3. Remove Product");
            System.out.println("4. View Products");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    viewProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Add Product
    static void addProduct() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        inventory.add(new InventorySystem(id, name, qty, price));
        System.out.println("Product added successfully!");
    }

    // Update Quantity
    static void updateQuantity() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        for (InventorySystem p : inventory) {
            if (p.id == id) {
                System.out.print("Enter new quantity: ");
                p.quantity = sc.nextInt();
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // Remove Product
    static void removeProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Iterator<InventorySystem> it = inventory.iterator();
        while (it.hasNext()) {
            InventorySystem p = it.next();
            if (p.id == id) {
                it.remove();
                System.out.println("Product removed!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // View Products
    static void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n--- Product List ---");
        for (InventorySystem p : inventory) {
            p.display();
        }
    }
}