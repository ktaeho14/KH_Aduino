package silsub2.model.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pr = new Product();
		pr.setBrand("»ï¼º");
		pr.setpName("tv");
		pr.setPrice(100000);
		
		
		System.out.println(pr.information());

	}

}
