package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        ProductService service = new ProductService();
//        service.addProduct(new Product("Asus vivobook", "Laptop", "Brown table", 2023));
//        service.addProduct(new Product("MIA3", "Phone", "Brown table", 2022));
//        service.addProduct(new Product("Oppo earbuds", "Earbuds", "Draw", 2022));
//        service.addProduct(new Product("Red boat earphones", "Earphones", "Draw", 2023));
//        service.addProduct(new Product("Type c", "Cable", "Brown table", 2024));
//        service.addProduct(new Product("Wallet", "Purse", "Shelf", 2025));

        List<Product> product = service.getAllProducts();
        for(Product p : product){
            System.out.println(p);
        }


    }
}