/**
 * 
 */
package com.application.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
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
    
    @Value("${className}")
    private String className;
    
    private String name;

    @Required
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.application.bl.Classroom#view()
	 */
	@Override
	public List<Student> view() {
		System.out.println("Class Name: "+className);
		return studentDao.getStudentsList();
	}
	 @Autowired
	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

}
