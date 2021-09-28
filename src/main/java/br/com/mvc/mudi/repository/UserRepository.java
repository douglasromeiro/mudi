package br.com.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mvc.mudi.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	User findByUsername(String username);
}
