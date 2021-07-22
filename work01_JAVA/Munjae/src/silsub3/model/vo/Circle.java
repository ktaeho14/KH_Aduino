package silsub3.model.vo;

public class Circle {
	public static double PI =3.14;
	private static int radius;
	
	//기본생성자
	public Circle() {}
	//매개변수생성자
	public Circle(double pI, int radius) {
		super();
		PI = pI;
		this.radius = radius;
	}
	
	
	//getter, setter 메소드
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		Circle ci1 = new Circle();
		ci1.setRadius(3);
		System.out.println("반지름 1증가 후 원의 둘레 : " + ((ci1.getRadius()+1) + (ci1.getRadius()+1))*PI);
		System.out.println("반지름 1증가 후 원의 넓이 : " + ((ci1.getRadius()+1)*2)*PI);
	}
	
	
	
}
