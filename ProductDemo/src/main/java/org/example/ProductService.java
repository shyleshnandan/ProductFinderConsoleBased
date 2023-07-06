package org.example;

import java.util.List;

public class ProductService {

    ProductDB db = new ProductDB();
    public void addProduct(Product p) {
        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }
}
