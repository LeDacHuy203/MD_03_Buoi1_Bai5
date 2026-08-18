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

    // GET - Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        return products;
    }

    // POST - Thêm sản phẩm
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    // PUT - Cập nhật sản phẩm
    public Product updateProduct(int id, Product product) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return p;
            }
        }

        return null;
    }

    // DELETE - Xóa sản phẩm
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