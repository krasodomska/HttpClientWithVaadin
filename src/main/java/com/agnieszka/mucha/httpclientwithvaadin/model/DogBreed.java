package com.agnieszka.mucha.httpclientwithvaadin.model;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class DogBreed {
    public String name;
    public String description;
    public Life life;
    public Weight male_weight;
    public Weight female_weight;
    public boolean hypoallergenic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Life getLife() {
        return life;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public Weight getMale_weight() {
        return male_weight;
    }

    public void setMale_weight(Weight male_weight) {
        this.male_weight = male_weight;
    }

    public Weight getFemale_weight() {
        return female_weight;
    }

    public void setFemale_weight(Weight female_weight) {
        this.female_weight = female_weight;
    }

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }
}


