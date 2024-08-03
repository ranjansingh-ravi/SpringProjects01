package com.ravie.learnspringframework.helloworldspring;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ravie.learnspringframework.gamingconsole.GameRunner;
import com.ravie.learnspringframework.gamingconsole.MarioGame;
import com.ravie.learnspringframework.gamingconsole.PacMan;
import com.ravie.learnspringframework.gamingconsole.SuperContra;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
		//1. launching a Spring context using AnnotationConfigApplicationContext class
		try (
	var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		//2. fetching the Bean from HelloWorldConfigurtation class using name of the Bean (Which in this case is "Name")
		System.out.println(context.getBean("name"));
		  System.out.println(context.getBean("age"));
		  System.out.println(context.getBean("person"));
		  System.out.println(context.getBean("Address2")); //referring by the Bean name mentioned specifically
		  System.out.println(context.getBean(Address.class)); // referring using return type
		  System.out.println(context.getBean("person2MethodCall"));
		  System.out.println(context.getBean("person3parameters"));
		  System.out.println(context.getBean(Person.class));
		  
		  //context.getBeanDefinitionNames();
		  //printing all the beans name using functional programming
		  Arrays.stream(context.getBeanDefinitionNames())
		          .forEach(System.out::println);
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}

}
   