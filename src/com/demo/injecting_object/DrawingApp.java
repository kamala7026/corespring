package com.demo.injecting_object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		/*Step 1
		 * Normal object creation without using bean factory. Here new keyword is used to create the object.
		 * 
		Tringle tringle=new Tringle();
		tringle.draw();
		Circle circle=new Circle();
		circle.draw();*/
		
		/*Step 2
		 * Here we are using the beanfactory to create the new object.
		 * Where spring.xml tells bean class location. 
		 */
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Tringle trigle1=(Tringle)beanFactory.getBean("tringle");
		trigle1.draw();
		
		/*Step 3
		 * Here we are using the ApplicationContext to create the new object.
		 * Where spring.xml tells bean class location. spring.xml should be inside the src folder or class directory
		 */
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Tringle trigle=(Tringle)context.getBean("tringle");
		trigle.draw();
		System.out.println("This Tringle is a "+trigle.getType()+" and height is "+trigle.getHeight());
		
		Circle circle=(Circle)context.getBean("circle");
		circle.draw();
		System.out.println("This Circle is a "+circle.getType());
	}

}
