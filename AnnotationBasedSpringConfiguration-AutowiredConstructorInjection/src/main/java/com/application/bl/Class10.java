/**
 * 
 */
package com.application.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
@Service("class10")
public class Class10 implements Classroom {
	
	private StudentDAO studentDao;	
	
	private List<String> nations;
	
	public void setNations(List<String> nations) {
		this.nations = nations;
	}

	private String className;

	public void setClassName(String className) {
		this.className = className;
	}

	@Autowired
	public Class10(StudentDAO studentDao,ApplicationContext applicationContext) {
		super();
		this.studentDao = studentDao;
		System.out.println("ApplicationContext: "+applicationContext);
	}

	/* (non-Javadoc)
	 * @see com.application.bl.Classroom#view()
	 */
	@Override
	public List<Student> view() {		
		System.out.println("Classname: "+className);
		for(String nation:nations){
			System.out.println(nation);
		}
		return studentDao.getStudentsList();
	}

}
