package projeto.sb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projeto.sb.entities.Category;
import projeto.sb.entities.Order;
import projeto.sb.entities.User;
import projeto.sb.entities.enums.OrderStatus;
import projeto.sb.repository.CategoryRepository;
import projeto.sb.repository.OrderRepository;
import projeto.sb.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {	
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Foods");
		
		categoryRepository.saveAll(Arrays.asList(c1, c2));
		
		User u1 = new User(null, "Gabriel", "gabriel@gmail.com", "99999998", "12345");
		User u2 = new User(null, "Felipe", "felipe@gmail.com", "99999997", "54321");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2));
	}
	
	
	
}
