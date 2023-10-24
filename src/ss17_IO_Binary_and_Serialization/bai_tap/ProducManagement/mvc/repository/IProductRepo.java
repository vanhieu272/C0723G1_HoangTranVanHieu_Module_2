package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository;

import ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.model.Product;

import java.util.List;

public interface IProductRepo<E> {
    void addProduct(Product product);

    List<E> displayProduct();

    List<E> findProduct(String name);

}
