package OOPSDay2.InventoryManagementSystem;

import java.util.Scanner;

public class WereHouse {
    private final Product []products=new Product[25];
    int index=0;

    public void addProduct() {
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        System.out.println("Enter product Id: ");
        p.setProductId(sc.nextInt());
        System.out.println("Enter product name: ");
        p.setProductName(sc.next());
        System.out.println("Enter product price: ");
        p.setProductPrice(sc.nextDouble());
        System.out.println("Enter product quantity: ");
        p.setQuantity(sc.nextInt());
        products[index++] = p;
        System.out.println(p);
    }
     void toDisplayProducts(){
         System.out.println("Hii");
         System.out.println(index);
        for (int i = 0; i < index; i++) {
            System.out.println(products[i]);
        }
    }
    void order(int id,int quantity){
        for (int i = 0; i < index; i++) {
            if(products[i].getProductId()==id){
                if(products[i].getQuantity()>quantity)
                products[i].setQuantity(products[i].getQuantity()-quantity);
                else System.out.println("No possible to place order quantity more than available:");
            }
        }
    }
}
