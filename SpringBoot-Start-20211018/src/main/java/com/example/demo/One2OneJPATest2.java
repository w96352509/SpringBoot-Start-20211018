package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.one2one.Card;
import com.example.demo.entity.one2one.Husband;
import com.example.demo.entity.one2one.Person;
import com.example.demo.entity.one2one.Wife;
import com.example.demo.repository.HusbandRepository;
import com.example.demo.repository.PersonRepository;

@SpringBootApplication
public class One2OneJPATest2 {
	
	public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(One2OneJPATest2.class, args);
	   PersonRepository personRepository = context.getBean(PersonRepository.class);
	   
	   Card card = new Card();
	   card.setNum("12345");
	   
	   Person person  = new Person();
	   person.setName("HH");
	   person.setCard(card);
	   personRepository.save(person);
	}
}
