package projeto.sb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projeto.sb.entities.User;
import projeto.sb.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {		
		User u1 = new User(null, "Gabriel", "gabriel@gmail.com", "99999998", "12345");
		User u2 = new User(null, "Felipe", "felipe@gmail.com", "99999997", "54321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
