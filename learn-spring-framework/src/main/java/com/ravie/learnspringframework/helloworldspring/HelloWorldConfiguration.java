package com.ravie.learnspringframework.helloworldspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Record introduced in Java 14 and refined in Java 16 is a feature to create custom object
// in concise way, without having to declare constructor, getter-setters, toString. JVM 
// automatically created constructor, getter-setters, toString, equals, hashCode.
// However the records are immutable - once created cannot be altered
record Person(String name, int age, Address address) { };

record Address (String firstLine, String City) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean 
	public String name() {
		return "Ravi";
		}
	
	@Bean 
	public int age() {
		return 20;
		}
	@Bean // creating Bean of custom object
	public Person person() {
		return new Person("Ranga", 45 , new Address("221 Baker Street", "London"));
	}
	
	@Bean (name = "Address2")
	@Primary
	public Address address() {
		return new Address("Rajarhat", "Kolkata");
	}
	
	@Bean (name = "Address3")
	public Address address3() {
		return new Address("Sodepur", "Kolkata");
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	@Primary
	public Person person3parameters(String name, int age, Address Address2) {
		return new Person(name, age, Address2);
	}
	
	
}
