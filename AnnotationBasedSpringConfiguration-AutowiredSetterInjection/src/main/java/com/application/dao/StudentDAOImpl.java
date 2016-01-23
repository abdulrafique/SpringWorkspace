/**
 * 
 */
package com.application.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {
	
	@Value("${daoUsed}")
	private String daoUsed;

	/* (non-Javadoc)
	 * @see com.application.dao.StudentDAO#getStudentsList()
	 */
	@Override
	public List<Student> getStudentsList() {
		System.out.println("DAO used: "+daoUsed);
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("Abdul","Rafique"));
		students.add(new Student("Nazia","Shariff"));
		return students;
	}

}
