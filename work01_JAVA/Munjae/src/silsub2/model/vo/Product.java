package silsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	//기본생성자
	public Product() {}

	//매개변수 생성자
	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	//getter, setter 메소드
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String information() {
		
		return "상품명: " + pName + " 가격 : " + price + " 브랜드명: " +brand;
	}
	
	
	
}
