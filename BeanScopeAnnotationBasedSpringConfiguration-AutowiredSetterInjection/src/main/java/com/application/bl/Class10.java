/**
 * 
 */
package com.application.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
@Service
@Scope("prototype")
public class Class10 implements Classroom {
	
    @Autowired
	private StudentDAO studentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.application.bl.Classroom#view()
	 */
	@Override
	public List<Student> view() {
		return studentDao.getStudentsList();
	}

}
