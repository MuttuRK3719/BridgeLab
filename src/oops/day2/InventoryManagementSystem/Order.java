package OOPSDay2.InventoryManagementSystem;

import java.util.Scanner;

public class Order {

    public static void orders() {
        WereHouse w = Main.w;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose num :");
            System.out.println("1 for display products ");
            System.out.println("2 for order product");
            System.out.println("3 for exit");
            switch (sc.nextInt()) {
                case 1:
                    w.toDisplayProducts();
                    break;
                case 2: {
                    System.out.println("Enter products id :");
                    int id = sc.nextInt();
                    System.out.println("Enter number of Quantities: ");
                    int quantity = sc.nextInt();
                    w.order(id, quantity);
                }
                default:
                    System.out.println("Choose correct one");
                case 3:  return;
            }
        } while (true);


    }
}
