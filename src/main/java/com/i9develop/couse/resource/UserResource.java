package com.i9develop.couse.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.i9develop.couse.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User(1L, "	Ana Maria", "ana.maria@gmail.com", "999999999", "123456");

		return ResponseEntity.ok().body(u);

	}

}
