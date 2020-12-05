package com.vsvdev.ua;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	private final UrerRepository repository;

	@Autowired
	public UserController(UrerRepository repository) {
				this.repository = repository;
	}

	public UrerRepository getRepository() {
		return repository;
	}
	
	
	 @GetMapping("/")
	    public List<User> all() {
	        return repository.findAll();
	    }


	    @PostMapping("/create")
	    public List<User> users(@RequestBody User user) {
	        
	          repository.save(user);
	        return repository.findAll();
	    }
}
