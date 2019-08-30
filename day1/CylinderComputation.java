package com.basic_example;

public class CylinderComputation {

	public static void main(String[] args) {

		double radious,height,surfaceArea,basearea,volume;
		
		final double PI = 3.14159265;
		radious=2.5;
		height=1.7;
		
		surfaceArea=2*PI*radious*radious+2*PI*radious*height;
		basearea=PI*radious*radious;
		volume=PI*radious*radious*height;
		
		
		System.out.println("THE REDIOUS OF CYLINDER IS:"+radious);
		System.out.println("THE HEIGHT OF CYLINDER IS:"+height);
		System.out.println("THE SURFACE AREA OF CYLINDER IS:"+surfaceArea);
		System.out.println("THE BASE AREA OF CYLINDER IS:"+basearea);
		System.out.println("THE VOLUME OF CYLINDER IS:"+volume);
	}

}
