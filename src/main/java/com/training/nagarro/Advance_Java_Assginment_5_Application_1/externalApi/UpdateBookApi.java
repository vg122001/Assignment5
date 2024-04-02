package com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import org.springframework.web.client.RestTemplate;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.API.ADD_BOOK_API;
import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.API.UPDATE_BOOK_API;

public class UpdateBookApi {
    private static RestTemplate restTemplate = new RestTemplate();
    public static void callUpdateBookAPI(Book b) {
        restTemplate.put(UPDATE_BOOK_API+b.getId(), b, Book.class);

    }
}
