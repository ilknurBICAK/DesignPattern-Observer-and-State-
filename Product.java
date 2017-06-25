
public class Product {
	
	private String name;
	private static float price;
    static int count;

	
	public Product( String name,int count){
		
		this.name=name;
		this.count=count;
	
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		
		
		
		Product.count = count;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static float getPrice() {
		return price;
	}
	public static void setPrice(float orderprice) {
		price = orderprice;
	}
	
	

}
