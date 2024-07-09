package com.example.demobuysell.servicers;

import com.example.demobuysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PlayStation 5", "PlayStation", 5555, "San-Francisco", "Igorao"));
        products.add(new Product(++ID, "Iphone 8", "iphone 8 64gb", 5555, "New-York", "Maksimilan"));
    }

    public List<Product> list() {
        return products;
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }


    public void saveProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
