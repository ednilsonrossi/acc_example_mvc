package io.ednilsonrossi.example.acc_example_mvc.controller;

import io.ednilsonrossi.example.acc_example_mvc.repository.ProductRepository;
import io.ednilsonrossi.example.acc_example_mvc.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<String> findAll() {
        return repository.findAll();
    }
}
