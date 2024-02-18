package com.agnieszka.mucha.httpclientwithvaadin.model;

import java.util.ArrayList;

public record DogBreedsResponse(
        ArrayList<DogBreedData> data,
        Links links
) {
}