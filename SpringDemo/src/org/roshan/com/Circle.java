package org.roshan.com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	private Point center;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle",null,"Default Greeting",null));
		System.out.println(this.messageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()},"Default Greeting",null));
		System.out.println("Circle:Point is:("+ center.getX()+","+center.getY()+")");
		DrawEvent drawEvent= new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		//System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeting",null));
		
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}

	@PreDestroy
	public void DestroyCircle() {
		System.out.println("Destruct of Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}
	
	

}
