package com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.API.*;

public class GetAllBooks {

	private static RestTemplate restTemplate = new RestTemplate();

	public static List<Book> callGetAllBooksAPI() {

		ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(GET_ALL_BOOKS_API, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Book>>() {
				});

		List<Book> users = responseEntity.getBody();
		users.stream().map(Book::getId).collect(Collectors.toList());


		
		return users;

	}
}
