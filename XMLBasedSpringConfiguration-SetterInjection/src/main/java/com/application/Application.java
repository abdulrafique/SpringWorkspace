/**
 * 
 */
package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.bl.Classroom;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Classroom class10=appContext.getBean("class10", Classroom.class);
		System.out.println(class10);
		for(Student student:class10.view()){
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
		
		ApplicationContext appContext1=new ClassPathXmlApplicationContext("applicationContext.xml");
		Classroom class101=appContext1.getBean("class10", Classroom.class);
		System.out.println(class101);
	}

}
