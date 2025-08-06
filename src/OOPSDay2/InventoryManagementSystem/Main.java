package OOPSDay2.InventoryManagementSystem;

import java.util.Scanner;

public class Main {
         static WereHouse w = new WereHouse();
    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose num :");
            System.out.println("1 related to order  ");
            System.out.println("2  related product");
            System.out.println("3 for exit");
            switch (sc.nextInt()) {
                case 1:
                    Order.orders();
                    break;
                case 2: {
                    w.addProduct();
                    break;
                }
                default:
                    System.out.println("Choose correct one");
                case 3:  return;

        }
    }while(true);
}}
