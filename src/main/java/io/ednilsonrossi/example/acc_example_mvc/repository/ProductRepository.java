package io.ednilsonrossi.example.acc_example_mvc.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    public List<String> findAll() {
        return List.of(
                "Notebook",
                "Mouse",
                "Teclado");
    }

}
