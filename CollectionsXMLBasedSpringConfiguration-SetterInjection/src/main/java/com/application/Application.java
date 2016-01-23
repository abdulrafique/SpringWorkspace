/**
 * 
 */
package com.application;

import java.util.List;
import java.util.Map;
import java.util.Properties;

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
		
		Classroom class11=appContext.getBean("class10", Classroom.class);
		/*//System.out.println(class11);
		for(Student student:class11.listStudent()){
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
		
		for(String nation:class11.nationality()){
			System.out.println(nation);
		}
		
		List<Map<Student,String>> studentNationList=class11.nationStudent();
		
			for(Student student:class11.listStudent()){
				for(Map<Student,String> mapStudentString:studentNationList){
					System.out.println(mapStudentString.get(student));
				}
			}
			
		Properties prop=class11.propStudentEmail();
		
		System.out.println(prop.get("India"));
		
		ApplicationContext appContext1=new ClassPathXmlApplicationContext("applicationContext.xml");
		Classroom class101=appContext1.getBean("class10", Classroom.class);
		System.out.println(class101);
		
		Classroom class10=appContext.getBean("class10", Classroom.class);
		System.out.println(class10.view());*/
	}

}
