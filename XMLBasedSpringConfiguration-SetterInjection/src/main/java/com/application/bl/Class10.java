/**
 * 
 */
package com.application.bl;

import java.util.List;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public class Class10 implements Classroom {
	
	private StudentDAO studentDao;

	

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

}
