
public class Dispacthing extends State {

	

	public void deliver(Context c){
		
		c.setState(c.getDeliver());
		System.out.println("delivering");
	    Product.count--;
		c.setState(c.getChecking());
		
		
		
		
		
	}

	

	

}
