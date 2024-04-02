package com.training.nagarro.Advance_Java_Assginment_5_Application_1.externalApi;

import com.training.nagarro.Advance_Java_Assginment_5_Application_1.model.Author;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

import static com.training.nagarro.Advance_Java_Assginment_5_Application_1.constants.Constants.externalUrl;


public class GetAllAuthors {

    public static RestTemplate restTemplate = new RestTemplate();

    public static List<Author> callGetAllAuthorsAPI() {

        ResponseEntity<List<Author>> responseEntity = restTemplate.exchange(externalUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Author>>() {
                });

        List<Author> users = responseEntity.getBody();
        users.stream().map(Author::getName).collect(Collectors.toList());

        return users;
    }
}
