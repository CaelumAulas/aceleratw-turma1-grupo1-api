package br.com.carangobom.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.carangobom.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE (u.login LIKE LOWER(CONCAT('%',:login,'%'))) ")
	List<User> findUsers(@Param("login") String login);

}
