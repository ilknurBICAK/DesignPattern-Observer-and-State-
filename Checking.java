
public class Checking extends State {
	

	


	public void afterchecking(Context c){
		
		
		if(Product.getCount()<=0){
			
			c.setState(c.getWaiting());
			System.out.println("waiting");
			
		}
		else{
			
			
			c.setState(c.getDispacting());
			System.out.println("dispatching after checking");
			c.deliver();
	
			
			
		}
		
		
		
	}
	
	

		
	
	
	

	
}
