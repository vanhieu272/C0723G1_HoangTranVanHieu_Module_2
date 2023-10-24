package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository.impl;

import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.model.Product;
import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository.AbstractProductRepo;
import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository.IProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl extends AbstractProductRepo implements IProductRepo<Product> {
    private final String LIST_PRODUCT_PATH = "D:\\Codegym\\module-2\\src\\ss17_IO_Binary_and_Serialization\\bai_tap\\ProducManagement\\mvc\\repository\\list_product.dat";

    @Override
    public void addProduct(Product product) {
        List<Product> productList = displayProduct();
        productList.add(product);
        writeByByteStream(LIST_PRODUCT_PATH, productList);
    }


    @Override
    public List<Product> displayProduct() {
        return readByByteStream(LIST_PRODUCT_PATH);
    }


    @Override
    public List<Product> findProduct(String name) {
        List<Product> productList = displayProduct();
        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }
}
