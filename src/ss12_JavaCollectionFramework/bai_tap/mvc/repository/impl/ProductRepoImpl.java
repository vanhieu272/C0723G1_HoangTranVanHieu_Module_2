package ss12_JavaCollectionFramework.bai_tap.mvc.repository.impl;

import ss12_JavaCollectionFramework.bai_tap.mvc.model.Product;
import ss12_JavaCollectionFramework.bai_tap.mvc.repository.IProductRepo;

import java.util.ArrayList;


public class ProductRepoImpl implements IProductRepo {
    private final ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        for (Product value : products) {
            if (value.getId() == id) {
                value.setId(product.getId());
                value.setProductName(product.getProductName());
                value.setPrice(product.getPrice());
                return;
            }
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);

                return;
            }
        }
        System.out.println("Invalid ID");
    }

    public Product searchProductByName(String name) {
        for (Product product : products) {
            if (product.getProductName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> sortByAscendingOrder() {
        ArrayList<Product> ascendingOrder = new ArrayList<>();
        products.sort((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        });
        for (Product product : products) {
            ascendingOrder.add(product);
        }
        return ascendingOrder;
    }

    @Override
    public ArrayList<Product> sortByDescendingOrder() {
        ArrayList<Product> descendingOrder = new ArrayList<>();

        products.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        });
        for (Product product : products) {
            descendingOrder.add(product);
        }
        return descendingOrder;
    }


}
