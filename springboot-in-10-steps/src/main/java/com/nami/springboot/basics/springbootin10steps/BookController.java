package com.nami.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;
import com.nami.springboot.basics.springbootin10steps.Book;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l, "life of nami", "namitha"));
	}
}
