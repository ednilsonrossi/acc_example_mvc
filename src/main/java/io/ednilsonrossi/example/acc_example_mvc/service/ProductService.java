package io.ednilsonrossi.example.acc_example_mvc.service;

import io.ednilsonrossi.example.acc_example_mvc.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<String> findAll() {
        return repository.findAll();
    }
}
