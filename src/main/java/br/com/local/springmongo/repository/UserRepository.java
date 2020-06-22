package br.com.local.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.local.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
