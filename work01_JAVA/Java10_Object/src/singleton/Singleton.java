package singleton;

public class Singleton {
	//[1]
	//private Singleton() {}  //기본생성자
	
	//[2]
	/*
	private Singleton() {}
	
	public static Singleton getInstance() {
		return new Singleton();
	*/
	
	//[3]
	private static Singleton one;
	
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton();
		}
		
		
		return one;
	}
	
	
	
	
	
	
	
	
	
	
	

}
