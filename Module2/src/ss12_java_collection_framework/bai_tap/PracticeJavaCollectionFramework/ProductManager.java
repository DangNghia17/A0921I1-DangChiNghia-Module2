package ss12_java_collection_framework.bai_tap.PracticeJavaCollectionFramework;

import java.util.*;

public class ProductManager {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Mouse"));
        products.add(new Product(2, "Keyboard"));
        products.add(new Product(3, "Laptop"));
        products.add(new Product(4, "Graphic Card"));
        products.add(new Product(5, "Headphone"));
        products.add(new Product(6, "Speaker"));
        boolean check = false;

        do {
            display();
            Scanner sc = new Scanner(System.in);
            int chooseMenu = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            switch (chooseMenu) {
                case 1: //add
                    System.out.println("Input your id you want to add : ");
                    products.add(new Product(sc1.nextInt(), sc2.nextLine()));
                    System.out.println("Product was added ... ");
                    System.out.println("....");
                    break;
                case 2: //edit
                    System.out.println("Input your id you want to edit : ");
                    products.get((sc1.nextInt() - 1)).setName(sc2.nextLine());
                    break;
                case 3: //delete
                    System.out.println("Input your id you want to delete : ");
                    products.remove((sc1.nextInt() - 1));
                    System.out.println("Product was deleted ... ");
                    break;
                case 4: // display
                    for (Product p : products) {
                        System.out.println(" " + p);
                    }
                    break;
                case 5:
                    System.out.println("Input your id you want to search : ");
                    int idSearch = sc1.nextInt();
                    if (products.get((idSearch - 1)).getId() == idSearch) {
                        System.out.println(products.get(idSearch - 1).getId());
                        System.out.println(products.get(idSearch - 1).getName());
                    } else {
                        System.out.println("Your id searched don't have in lists");
                    }
                    break;
                case 6:
//                    products.sort(Comparator.comparing(product -> ));   //em chưa làm được function này
                    break;
                case 0:
                    System.out.println("Exiting program .....");
                    System.exit(0);
                default:
                    System.out.println("\t \t Please choose correct number again !!!");
                    System.out.println("\t \t **************************************** \n");
                    check = true;
            }
        } while (check);

    }

    public static void display() {
        System.out.println("Main Menu  : ");
        System.out.println("Input your function your want : ");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Display all product ");
        System.out.println("5. Seach");
        System.out.println("6. Sort product and display ");
        System.out.println("0. Out Menu");
    }

}
