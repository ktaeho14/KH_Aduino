package silsub3.run;

import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle ci = new Circle();
		
		ci.setRadius(3);
		
		System.out.println("원의 둘레: "+(ci.getRadius()+ci.getRadius())*2);
		System.out.println("원의 넓이: " + (ci.getRadius())*2);
		
		ci.incrementRadius();
	}

}
