package projeto.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.sb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
