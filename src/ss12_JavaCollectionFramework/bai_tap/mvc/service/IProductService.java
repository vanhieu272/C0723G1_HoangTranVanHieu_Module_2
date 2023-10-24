package ss12_JavaCollectionFramework.bai_tap.mvc.service;



import ss12_JavaCollectionFramework.bai_tap.mvc.model.Product;

import java.util.ArrayList;

public interface IProductService {
    void addProduct(Product product);

    void editProduct(int id,Product product);

    void removeProduct(int id);

    ArrayList<Product> getProducts();

    Product searchProductByName(String name);


    ArrayList<Product> sortByAscendingOrder();

    ArrayList<Product> sortByDescendingOrder();


}
