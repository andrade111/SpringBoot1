package projeto.sb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.sb.entities.Order;
import projeto.sb.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj = repository.findById(Id); 
		return obj.orElseThrow(()-> new RuntimeException("usuario nao encontrado."));
	}
}