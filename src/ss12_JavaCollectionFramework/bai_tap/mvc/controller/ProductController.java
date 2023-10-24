package ss12_JavaCollectionFramework.bai_tap.mvc.controller;


import ss12_JavaCollectionFramework.bai_tap.mvc.model.Product;
import ss12_JavaCollectionFramework.bai_tap.mvc.service.impl.ProductServiceImpl;

import java.util.ArrayList;

public class ProductController {
    private final ProductServiceImpl productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public void editProduct(int id, Product product) {
        this.productService.editProduct(id, product);
    }

    public void removeProduct(int id) {
        this.productService.removeProduct(id);
    }

    public ArrayList<Product> getProducts() {
        return this.productService.getProducts();
    }

    public Product searchProductByName(String name) {
        return this.productService.searchProductByName(name);
    }

    public ArrayList<Product> sortByAscendingOrder() {
        return this.productService.sortByAscendingOrder();
    }


    public ArrayList<Product> sortByDescendingOrder() {
        return this.productService.sortByDescendingOrder();
    }
}
