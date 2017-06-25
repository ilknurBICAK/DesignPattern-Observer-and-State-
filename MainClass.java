
public class MainClass {
	
	
	public static void main(String[] args) {
	
		Product p=new Product("fen", 2);
		OrderData subject = new OrderData();
		Customer1 customer1=new Customer1(subject);
		Customer2 customer2=new Customer2(subject);
		subject.setMeasurements(80);
		subject.setMeasurements(82);
		subject.setMeasurements(78);
		
		customer1.buy();
		customer2.buy();
		customer1.buy();
		Product.setCount(2);
		System.out.println(Product.getCount());
		customer1.buy();
		customer1.buy();
		customer2.buy();
		Product.setCount(2);
		customer2.buy();
		customer2.buy();
		}

}
