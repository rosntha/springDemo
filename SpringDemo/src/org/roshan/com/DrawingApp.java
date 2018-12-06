package org.roshan.com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// Triangle triangle =new Triangle();
		// Instantiate Bean Factory
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		// ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
		// factory.getBean("triangle");
		AbstractApplicationContext acc = new ClassPathXmlApplicationContext("spring.xml");
		acc.registerShutdownHook();
		// Triangle t = (Triangle)acc.getBean("triangle");
		// t.draw();
		Shape shape = (Shape) acc.getBean("circle");
		shape.draw();
		//System.out.println(acc.getMessage("greeting",null,"Default Greeting",null));
		
		
		
		//triangle.draw();

	}

}
