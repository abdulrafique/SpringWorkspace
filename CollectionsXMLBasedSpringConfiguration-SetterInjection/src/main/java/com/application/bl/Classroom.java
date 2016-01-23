/**
 * 
 */
package com.application.bl;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public interface Classroom {
	public List<Student> view();
	public List<Student> listStudent();
	public List<String> nationality();
	public List<Map<Student,String>> nationStudent();
	public Properties propStudentEmail();
}
