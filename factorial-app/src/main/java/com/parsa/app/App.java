package com.parsa.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Point originOne=new Point(2,3);
    	Rectangle rect1=new Rectangle(originOne,5,6);
    	Rectangle rect2=new Rectangle(10, 20);
    	
    	int height=new Rectangle().height;
    	
    	System.out.println("the width of the rectangle:"+rect1.width);
    	System.out.println("the height of the rectangle:"+rect1.height);
    	System.out.println("the area of rectangle:"+rect2.getArea());
    	
    	
    	System.out.println(new Rectangle(100, 50).getArea());
    	
    	System.out.println(height);
    	System.out.println(height=new Rectangle().height);
    	
    	
    	rect2.origin=originOne;
    	System.out.println("X is"+rect2.origin.x);
    	System.out.println("Y is"+rect2.origin.y);
    	
    	rect2.moveOrigin(25, 30);
    	System.out.println("X is"+rect2.origin.x);
    	System.out.println("Y is"+rect2.origin.y);
    	
    	
    	
    	
    	Factorial factorial=new Factorial();
    	System.out.println(factorial.getFactorial(5));
    }
}
