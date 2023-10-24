package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.service;

import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.model.Product;

import java.util.List;

public interface IProductService<E> {
    void addProduct(Product product);

    List<E> displayProduct();

    List<E> findProduct(String name);
}
