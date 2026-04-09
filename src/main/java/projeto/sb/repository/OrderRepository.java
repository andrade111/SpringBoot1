package projeto.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.sb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
