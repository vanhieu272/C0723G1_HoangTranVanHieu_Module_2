package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.controller;

import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.model.Product;
import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
   private ProductServiceImpl productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public List<Product> displayProduct() {
        return productService.displayProduct();
    }

    public List<Product> findProduct(String name) {
        return productService.findProduct(name);
    }
}
