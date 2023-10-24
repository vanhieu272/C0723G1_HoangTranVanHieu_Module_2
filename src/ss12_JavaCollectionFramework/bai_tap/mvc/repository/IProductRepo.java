package ss12_JavaCollectionFramework.bai_tap.mvc.repository;


import ss12_JavaCollectionFramework.bai_tap.mvc.model.Product;

import java.util.ArrayList;

public interface IProductRepo {
    void addProduct(Product product);

    ArrayList<Product> getProducts();

    void editProduct(int id,Product product);

    void removeProduct(int id);

    Product searchProductByName(String name);

    ArrayList<Product> sortByAscendingOrder();

    ArrayList<Product> sortByDescendingOrder();

}

