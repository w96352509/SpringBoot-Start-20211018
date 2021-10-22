package com.example.demo;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.one2one.Husband;
import com.example.demo.entity.one2one.Wife;
import com.example.demo.repository.HusbandRepository;

@SpringBootApplication
public class One2OneJPATest {
	static ApplicationContext context;
	static HusbandRepository hsuHusbandRepository;

	public static void main(String[] args) {
		 context = SpringApplication.run(One2OneJPATest.class, args);
		 hsuHusbandRepository = context.getBean(HusbandRepository.class);

		 
		 //add()
		 //query();
		 findOne(1L);
		 findOne("John1");
	}
	private static void findOne(Long id) {
	Optional<Husband> optional	=hsuHusbandRepository.findById(id);
		if (optional.isPresent()) {
			Husband husband = optional.get();
			System.out.println(husband);
		}else {
			System.out.println("Not Found");
		}
	}
	
	private static void findOne(String name) {
		System.out.println(hsuHusbandRepository.findByName(name));
	}
	 
	
	private static void query() {
		List<Husband> Husbands =hsuHusbandRepository.findAll();
		for(Husband h : Husbands) {
			System.out.println(h);
			System.out.println(h.getName());
			System.out.println(h.getWife().getHusband().getName());
			System.out.println(h.getWife().getName());
		}
	}

	private static void add() {
		Wife wife = new Wife();
		wife.setName("Mary");

		Husband husband = new Husband();
		husband.setName("John");
		husband.setWife(wife);
		hsuHusbandRepository.save(husband);

	}
}
