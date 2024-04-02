package com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.API.ADD_BOOK_API;

public class AddBook {
	private static RestTemplate restTemplate = new RestTemplate();
	public static void callCreateBookAPI(Book b) {
		restTemplate.postForEntity(ADD_BOOK_API, b, Book.class);
		//System.out.println(user2.getBody());
	}

}
