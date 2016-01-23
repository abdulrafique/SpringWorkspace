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
@Repository("studentDao")
public class StudentDAOImpl1 implements StudentDAO {

	/* (non-Javadoc)
	 * @see com.application.dao.StudentDAO#getStudentsList()
	 */
	@Override
	public List<Student> getStudentsList() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<Student>();
		students.add(new Student("Maha","Mamadapur"));
		students.add(new Student("Vrushal","Kedar"));
		students.add(new Student("Alok","Mishra"));
		return students;
	}

}
