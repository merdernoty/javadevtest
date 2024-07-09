package com.example.demobuysell.controllers;

import com.example.demobuysell.models.Product;
import com.example.demobuysell.servicers.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("products", productService.list());
        return "products";
    }

    @GetMapping("/products/info/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        model.addAttribute("product" , productService.getProductById(id));

        return "product-info";
    }

    @PostMapping("/products/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/products/del/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }
}