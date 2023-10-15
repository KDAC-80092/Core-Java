package com.app.point;

public class Point2D {

	double x_axis;
	double y_axis;
	
	public Point2D() {
		this(0,0);
	}
	public Point2D(double x_axis, double y_axis) {
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}
	
	public String getDetails() {
        return "Point(" + x_axis + ", " + y_axis + ")";
    }
	
	
	public boolean isEqual(Point2D p2)
	{
		if(this.x_axis == p2.x_axis && this.y_axis == p2.y_axis)
		{
			return true;
		}
		else
			return false;
	}
	
	public double calculateDistance(Point2D p2)
	{	
		return (Math.sqrt(Math.pow((p2.x_axis-this.x_axis),2)+Math.sqrt(Math.pow((p2.y_axis-this.y_axis),2))));
	}
	
}
