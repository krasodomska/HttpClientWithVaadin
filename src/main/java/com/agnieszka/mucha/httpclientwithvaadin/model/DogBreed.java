package com.agnieszka.mucha.httpclientwithvaadin.model;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public record DogBreed(
        String name,
        String description,
        Life life,
        Weight male_weight,
        Weight female_weight,
        boolean hypoallergenic) {

}


