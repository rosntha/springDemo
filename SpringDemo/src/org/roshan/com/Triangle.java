package org.roshan.com;

public class Triangle implements Shape{
//ApplicationContextAware,BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	//private List<Point> points;
	
	
	
	
	/*private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}*/



	/*public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
	}*/








	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		//System.out.println("Drawing Circle");
		System.out.println("Point A=("+getPointA().getX()+", " + getPointA().getY() + ")");
		System.out.println("Point B=("+getPointB().getX()+", "+ getPointB().getY() + ")");
		System.out.println("Point C=("+getPointC().getX()+", "+ getPointC().getY() + ")");
		
		
		/*for (Point pt: points) {
			System.out.println("Point=(" +pt.getX() + "," + pt.getY()+")");
		}*/

	}






	
	
	
	
	
	/*private String type;
	private int height;
	
	public Triangle(String type) {
		this.type=type;
	
	}
	public Triangle(String type, int height) {
		this.type=type;
		this.height=height;
	}
	public Triangle(int height) {

		this.height=height;
	}
	
	
	public int getHeight() {
		return height;
	}



	public String getType() {
		return type;
	}


	


	public void draw() {
		System.out.println(getType() + "Triangle Drawn" + getHeight()+ " is a height");
	} */

}
