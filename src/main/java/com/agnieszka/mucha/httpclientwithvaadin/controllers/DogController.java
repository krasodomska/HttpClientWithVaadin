package com.agnieszka.mucha.httpclientwithvaadin.controllers;

import com.agnieszka.mucha.httpclientwithvaadin.model.DogBreed;
import com.agnieszka.mucha.httpclientwithvaadin.model.DogBreedData;
import com.agnieszka.mucha.httpclientwithvaadin.model.DogBreedsResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DogController {
    static public List<DogBreed> getDogBreeds() {
        RestTemplate restTemplate = new RestTemplate();
        DogBreedsResponse response = restTemplate.getForObject("https://dogapi.dog/api/v2/breeds", DogBreedsResponse.class);
        return response.data().stream()
                .map(DogBreedData::attributes)
                .collect(Collectors.toList());
    }
}
