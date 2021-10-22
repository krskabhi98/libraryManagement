package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Author;

public interface AuthorService {

	Author addAuthor(Author author);

	List<Author> findAllAuthor();

}
