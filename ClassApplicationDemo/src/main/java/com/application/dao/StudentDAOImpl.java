/**
 * 
 */
package com.application.dao;

import java.util.ArrayList;
import java.util.List;

import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
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
