/**
 * 
 */
package com.application.bl;

import java.util.List;

import com.application.dao.StudentDAO;
import com.application.dao.StudentDAOImpl;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public class Class10 implements Classroom {

	/* (non-Javadoc)
	 * @see com.application.bl.Classroom#view()
	 */
	@Override
	public List<Student> view() {
		
		StudentDAO studentDao=new StudentDAOImpl();
		
		return studentDao.getStudentsList();
	}

}
