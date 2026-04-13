package projeto.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.sb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
