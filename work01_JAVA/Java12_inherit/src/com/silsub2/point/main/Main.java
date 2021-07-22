package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		Rectangle[] r = new Rectangle[3];

		
		
		c[0] = new Circle(10,10,1);
		c[1] = new Circle(20,20,50);
		c[2] = new Circle(30,30,100);
		
		
		c[0].draw();
		c[1].draw();
		c[2].draw();
		
		r[0]=new Rectangle(8,5,10,10);
		r[1]=new Rectangle(8,5,10,10);
		r[2]=new Rectangle(8,5,10,10);
		
		r[0].draw();
		r[1].draw();
		r[2].draw();
	}

}
