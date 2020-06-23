package br.com.local.springmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.local.springmongo.domain.Post;
import br.com.local.springmongo.repository.PostRepository;
import br.com.local.springmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post> findAll(){
		return postRepository.findAll();
	}
	
	public Post findById(String id) throws ObjectNotFoundException {
		return postRepository.findById(id).orElseThrow(()->new ObjectNotFoundException("Usuário não encontrado"));
	}

	public List<Post> findByTitle(String text){
		return postRepository.searchTitle(text);
	}
}
