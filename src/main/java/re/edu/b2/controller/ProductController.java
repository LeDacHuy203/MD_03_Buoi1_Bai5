package re.edu.b2.controller;

import org.springframework.web.bind.annotation.*;
import re.edu.b2.Product;
import re.edu.b2.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // POST /api/products
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // PUT /api/products/{id}
    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable int id,
            @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }

    // DELETE /api/products/{id}
    @DeleteMapping("/{id}")
    public Product delete(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}