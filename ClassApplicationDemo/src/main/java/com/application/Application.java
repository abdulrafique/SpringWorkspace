/**
 * 
 */
package com.application;

import com.application.bl.Class10;
import com.application.bl.Classroom;

/**
 * @author abdulr02
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Classroom class10=new Class10();
		System.out.println(class10.view().toString());

	}

}
