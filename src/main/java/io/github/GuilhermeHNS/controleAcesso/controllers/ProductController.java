package io.github.GuilhermeHNS.controleAcesso.controllers;

import io.github.GuilhermeHNS.controleAcesso.repositories.ProductRepository;
import io.github.GuilhermeHNS.controleAcesso.domain.product.Product;
import io.github.GuilhermeHNS.controleAcesso.domain.product.ProductRequestDTO;
import io.github.GuilhermeHNS.controleAcesso.domain.product.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Validated ProductRequestDTO body) {
        Product newProduct = new Product(body);

        this.repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO :: new).toList();

        return ResponseEntity.ok(productList);
    }
}
