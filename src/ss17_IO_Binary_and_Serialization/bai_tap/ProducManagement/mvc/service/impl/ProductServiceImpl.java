package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.service.impl;

import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.model.Product;
import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository.impl.ProductRepoImpl;
import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
   private ProductRepoImpl productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public List displayProduct() {
        return productRepo.displayProduct();
    }

    @Override
    public List findProduct(String name) {
        return productRepo.findProduct(name);
    }
}
