package org.lessons.java.spring.pizzeria.spring_la_mia_pizzeria_crud_application.controllers;

import org.lessons.java.spring.pizzeria.spring_la_mia_pizzeria_crud_application.models.Pizza;
import org.lessons.java.spring.pizzeria.spring_la_mia_pizzeria_crud_application.repository.PizzaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;



@Controller
public class PizzaController {
    private final PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Pizza> pizzas = pizzaRepository.findAll();
        model.addAttribute("pizze", pizzas != null ? pizzas : new ArrayList<>()); 
        return "index";
    }
}
