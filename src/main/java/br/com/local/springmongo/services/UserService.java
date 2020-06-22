package br.com.local.springmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.local.springmongo.domain.User;
import br.com.local.springmongo.repository.UserRepository;
import br.com.local.springmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) throws ObjectNotFoundException {
		return userRepository.findById(id).orElseThrow(()->new ObjectNotFoundException("Usuário não encontrado"));
	}
}
