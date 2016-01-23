/**
 * 
 */
package com.application.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
@Service
public class Class10 implements Classroom {
	
	private StudentDAO studentDao;	

	@Autowired
	public Class10(StudentDAO studentDao) {
		super();
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
