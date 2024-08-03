package com.ravie.learnspringframework.helloworldspring;

import java.io.Serializable;

class POJO {
	
	public int age;
	public String name;
	
	public String toString()
	{
	   return "text - " + "age :" + age + "name :"	+ name;
	}
}


class JavaBeans implements Serializable{ // its an EJB concept and no longer in trend
     // but for a class to be Java Bean must qualify three features
	//1. should have a public no-arg constructors
	public JavaBeans()
	{
		
	}
	
	//2. attributes must be private and should have getters and setters
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//3. class must implement serializable interface
	
	
}


