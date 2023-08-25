package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Student s=context.getBean("student", Student.class);
		s.displayInfo();
		
		Student s1=context.getBean("student1", Student.class);
		s1.displayInfo();
	}

}
