package org.lessons.java.spring.pizzeria.spring_la_mia_pizzeria_crud_application.repository;
import org.lessons.java.spring.pizzeria.spring_la_mia_pizzeria_crud_application.models.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
