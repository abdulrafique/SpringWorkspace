/**
 * 
 */
package com.application.bl;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.LifecycleProcessor;

import com.application.dao.StudentDAO;
import com.application.data.Student;

/**
 * @author abdulr02
 *
 */
public class Class10 implements Classroom,InitializingBean,DisposableBean,ApplicationContextAware,LifecycleProcessor {
	
	private StudentDAO studentDao;
	private ApplicationContext applicationContext;

	

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



	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties Set:Class10: "+this.toString());
		
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("ApplicationContext Aware");
		this.applicationContext=applicationContext;
		
	}



	@Override
	public void start() {
		System.out.println("Started::::::");
		
	}



	@Override
	public void stop() {
		System.out.println("Stopped::::::");
		
	}



	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void onRefresh() {
		System.out.println("Refreshed::::::");
		
	}



	@Override
	public void onClose() {
		System.out.println("Closed::::::");
		
	}

}
