package com.demo.graphqlproject.resolver;

import com.demo.graphqlproject.domain.Person;
import com.demo.graphqlproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@QueryMapping
	private List<Person> getAll() {
		return personRepository.findAll();
	}
}
