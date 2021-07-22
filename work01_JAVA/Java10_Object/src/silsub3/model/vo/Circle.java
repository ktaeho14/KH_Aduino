package silsub3.model.vo;

public class Circle {

	//필드
	public static double PI=3.14;
	private static int radius;
	
	//생성자
	public Circle(){}
	
	
	//setter
	public void setPI(double PI) {
		this.PI =  PI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//getter
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	
	
	public void incrementRadius() {
		Circle ci = new Circle();
		
		ci.setRadius(1);
		ci.setPI(3.14);
		
		System.out.println("반지름 길이는: " + ci.getRadius());
		System.out.println("원의 둘레는: " + (ci.getRadius()*2) * ci.getPI());
		System.out.println("원의 넓이는: " + ci.getRadius()*ci.getRadius()*ci.getPI());	
		
		for(int i=0; ;i++){
		ci.setRadius(i++);
		ci.setPI(3.14);
		
		System.out.println("반지름 길이 +1 :" + ci.getRadius());
		System.out.println("원의 둘레는: " + (ci.getRadius()*2) * ci.getPI());
		System.out.println("원의 넓이는: " + ci.getRadius()*ci.getRadius()*ci.getPI());	
		}
	}
	
}
