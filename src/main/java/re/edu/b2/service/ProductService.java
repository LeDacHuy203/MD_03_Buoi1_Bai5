package re.edu.b2.service;

import org.springframework.stereotype.Service;
import re.edu.b2.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "iPhone 15", 2000));
        products.add(new Product(2, "Samsung S24", 1800));
        products.add(new Product(3, "Xiaomi 14", 1200));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    //    Them san pham
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    //    Cap nhat san pham
    public Product updateProduct(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, product);
                return product;
            }
        }
        return null;
    }

    //    Xoa
    public Product deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == id) {
                products.remove(i);
                return product;
            }
        }
        return null;
    }

}