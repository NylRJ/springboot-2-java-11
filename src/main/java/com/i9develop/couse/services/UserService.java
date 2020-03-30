package com.i9develop.couse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i9develop.couse.entities.User;
import com.i9develop.couse.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {

		return userRepository.findAll();
	}

	public User findById(Long id) {

		Optional<User> obj = userRepository.findById(id);

		return obj.get();
	}

	public User insert(User obj) {

		return userRepository.save(obj);
	}
	
	
	public void delete(long id) {

		userRepository.deleteById(id);
	}
	
	public User update(long id, User obj) {

		User entity = userRepository.getOne(id);
		
		updateData(entity,obj );
		
		return userRepository.save(entity);
		
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
 
		
	}
	
	
	
}
