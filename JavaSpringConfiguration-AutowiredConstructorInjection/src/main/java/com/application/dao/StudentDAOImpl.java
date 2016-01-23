/**
 * 
 */
package com.application.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

	/* (non-Javadoc)
	 * @see com.application.dao.StudentDAO#getStudentsList()
	 */
	@Override
	public List<Student> getStudentsList() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("Abdul","Rafique"));
		students.add(new Student("Nazia","Shariff"));
		return students;
	}

}
