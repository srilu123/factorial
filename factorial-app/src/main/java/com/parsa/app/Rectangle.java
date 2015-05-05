package com.parsa.app;

public class Rectangle {
	int height=0;
	int width=0;
	float area;
	Point origin;
	public Rectangle(){
		origin=new Point(0,0);
	}
	public Rectangle(Point p,int w,int h){
		origin=p;
		width=w;
		height=h;
	}
		public Rectangle(int w,int h)
		{
			width=w;
			height=h;
			
		}
		public void moveOrigin(int x,int y){
			origin.x=x;
			origin.y=y;
		}
	public int getArea()
	
	{
		
		return width*height;
		
	}

}
