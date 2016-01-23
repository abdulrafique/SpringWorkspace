/**
 * 
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
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
		ConfigurableApplicationContext  appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Classroom class10=appContext.getBean("class10", Classroom.class);
		for(Student student:class10.view()){
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
		appContext.registerShutdownHook();
	}

}
