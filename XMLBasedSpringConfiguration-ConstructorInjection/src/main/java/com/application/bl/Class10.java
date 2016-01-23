/**
 * 
 */
package com.application.bl;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public class Class10 implements Classroom,BeanNameAware {
	
	private StudentDAO studentDao;

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
	
	/**
	 * Init
	 */
	public void init(){		
		if(studentDao!=null){
			System.out.println("After properties set");
		}else{
			System.out.println("Student DAO is "+studentDao);
		}
	}
	
	public void destroy(){
		System.out.println("destroy");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name);
		
	}

}
