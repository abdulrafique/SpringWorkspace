/**
 * 
 */
package com.application.bl;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public class Class10 implements Classroom {
	
	private StudentDAO studentDao;
	private List<Student> studentList;
	private List<String> nationality;
	private List<Map<Student,String>> studentNationList;
	private Properties propEmail;

	

	public void setPropEmail(Properties propEmail) {
		this.propEmail = propEmail;
	}



	public void setStudentNationList(List<Map<Student,String>> studentNationList) {
		this.studentNationList = studentNationList;
	}



	public void setNationality(List<String> nationality) {
		this.nationality = nationality;
	}



	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}



	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}



	/* (non-Javadoc)
	 * @see com.application.bl.Classroom#view()
	 */
	@Override
	public List<Student> view() {		
		return studentDao.getStudentsList();
	}



	@Override
	public List<Student> listStudent() {		
		return studentList;
	}



	@Override
	public List<String> nationality() {
		
		return nationality;
	}



	@Override
	public List<Map<Student,String>> nationStudent() {
		
		return studentNationList;
	}



	@Override
	public Properties propStudentEmail() {
		
		return propEmail;
	}
	
	public void init(){
		System.out.println("Bean getting initialised");
	}

}
