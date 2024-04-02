package com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Book;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.externalUrl;
import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi.API.GET_ALL_BOOKS_API;

public class GetBookById {


    public static RestTemplate restTemplate = new RestTemplate();


    public static Optional<Book> callToGetBookById(String id){

        String externalUrlWithId;
        externalUrlWithId=externalUrl+id;
        ResponseEntity<Book> responseEntity = restTemplate.exchange(externalUrlWithId, HttpMethod.GET, null,
                new ParameterizedTypeReference<Book>() {
                });

        Optional<Book> book = Optional.ofNullable(responseEntity.getBody());
        book.stream().map(Book::getId).collect(Collectors.toList());



        return book;
    }
}
