package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {
	
	public String reu() {
		return "Hello welcome";
	}
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/addAuthor")
	public Author addAuthor(@RequestBody Author author) {
		
		return authorService.addAuthor(author);
	}
	
	@GetMapping("getAllAuthor")
	public List<Author> getAllAuthor() {
		return authorService.findAllAuthor();
	}
}
