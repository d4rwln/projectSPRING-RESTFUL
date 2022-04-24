package com.dwsolutions.projectSPRING1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwsolutions.projectSPRING1.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1,"Jose", "d@mail.com","99887766","123123");
		return ResponseEntity.ok().body(u);
	}
}
