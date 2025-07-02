package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    // List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, 5000, "iphone"), new Product(102, 60000, "Canon")));

    public List<Product> getProduct() {
        //return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().get();
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(Product prod) {

        //products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId())
//                index = i;
//        }
//        products.set(index, prod);
        repo.save(prod); // it will check if data is there then update else save
    }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prodId)
//                index = i;
//            products.remove(index);
//        }
//    }
        repo.deleteById(prodId);
    }
}