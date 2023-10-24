package ss12_JavaCollectionFramework.bai_tap.mvc.view;

import ss12_JavaCollectionFramework.bai_tap.mvc.controller.ProductController;
import ss12_JavaCollectionFramework.bai_tap.mvc.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private final Scanner scanner = new Scanner(System.in);

    private final ProductController productController = new ProductController();


    public void showMenu() {
        System.out.println("♥♥♥ MENU ♥♥♥");
        System.out.println("1. Add product");
        System.out.println("2. Edit product");
        System.out.println("3. Remove product");
        System.out.println("4. Display products");
        System.out.println("5. Search product by name");
        System.out.println("6. Sort list products");
        System.out.println("7. Exit");
    }

    public int chooseFunction() {
        int choice = 0;
        this.showMenu();
        do {
            System.out.println("♥Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 1 || choice > 6);

        if (choice == 7) {
            System.exit(0);
        }
        return choice;
    }

    public void manage() {
        int choice;
        do {
            choice = this.chooseFunction();
            switch (choice) {
                case 1:
                    ArrayList<Product> products1 = productController.getProducts();
                    int id_check = inputID();
                    if(checkID(id_check)) {
                        this.productController.addProduct(this.inputProduct(id_check));
                        for (Product product : products1) {
                            System.out.println(product);
                        }
                    }else{
                        System.out.println("ID da ton tai!!");
                    }
                    break;
                case 2:
                    ArrayList<Product> products2 = productController.getProducts();
                    int id = inputID();
                    this.productController.editProduct(id, this.inputNewInfor(id));
                    for (Product product : products2) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    ArrayList<Product> products3 = productController.getProducts();
                    this.productController.removeProduct(this.inputID());
                    if (products3.isEmpty()) {
                        System.out.println("Danh sach dang trong");
                    } else {
                        for (Product product : products3) {
                            System.out.println(product);
                        }
                    }
                    break;
                case 4:
                    ArrayList<Product> products4 = productController.getProducts();
                    for (Product product : products4){
                        System.out.println(product);
                    }
                    break;
                case 5:
                    String productsearching = inputName();
                    if (productController.searchProductByName(productsearching) == null) {
                        System.out.println("Product's name not found");
                    } else {
                        System.out.println(productController.searchProductByName(productsearching));
                    }
                    break;
                case 6:
                    if (chooseOption() == 1) {
                        this.productController.sortByAscendingOrder();
                    } else {
                        this.productController.sortByDescendingOrder();
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 7);
    }

    public Product inputProduct(int id) {
        Product product = new Product();
        product.setId(id);
        System.out.println("Enter name of product: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Enter price of product: ");
        product.setPrice(Float.parseFloat(scanner.nextLine()));
        return product;
    }

    public int inputID() {
        System.out.println("Please enter ID of product: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public boolean checkID(int id){
        ArrayList<Product> products = productController.getProducts();
        for(Product product : products){
            if(product.getId() == id){
                return false;
            }
        }
        return true;
    }

    public Product inputNewInfor(int id) {
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new price: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, price);
    }

    public String inputName() {
        System.out.println("Please enter name of product: ");
        String name;
        name = scanner.nextLine();
        return name;
    }

    public int chooseOption() {
        System.out.println("1. Sort by ascending order");
        System.out.println("2. Sort by descending order");
        System.out.println("Please choose option: ");
        int option = Integer.parseInt(scanner.nextLine());
        return option;
    }
}
