package springhero.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springhero.example.entity.Account;
import springhero.example.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
