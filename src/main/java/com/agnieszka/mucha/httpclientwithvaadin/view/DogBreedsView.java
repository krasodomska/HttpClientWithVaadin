package com.agnieszka.mucha.httpclientwithvaadin.view;


import com.agnieszka.mucha.httpclientwithvaadin.controllers.DogController;
import com.agnieszka.mucha.httpclientwithvaadin.model.DogBreed;
import com.agnieszka.mucha.httpclientwithvaadin.model.DogBreedsResponse;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Route("/breeds") // map view to the root
    class DogBreedsView extends AppLayout {
        DogBreedsView() {
            H1 title = new H1("Dog breeds chart");
            title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                    .set("margin", "var(--lumo-space-m)");
            addToNavbar(title);

            Grid<DogBreed> grid = new Grid<>(DogBreed.class, false);
            grid.addColumn(DogBreed::name).setHeader("Name");
            grid.addColumn(DogBreed::description).setHeader("Description");
            grid.addColumn(DogBreed::life).setHeader("Life span");
            grid.addColumn(DogBreed::female_weight).setHeader("Female_weight");
            grid.addColumn(DogBreed::male_weight).setHeader("Male_weight");

            List<DogBreed> people = DogController.getDogBreeds();
            grid.setItems(people);
            grid.setAllRowsVisible(true);
            setContent(grid);
        }
        }


