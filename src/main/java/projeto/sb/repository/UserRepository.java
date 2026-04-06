package projeto.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.sb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
