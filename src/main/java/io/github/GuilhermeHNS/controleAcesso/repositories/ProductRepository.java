package io.github.GuilhermeHNS.controleAcesso.repositories;

import io.github.GuilhermeHNS.controleAcesso.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
