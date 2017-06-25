
public class Waiting extends State {


public void cargo(Context c){

if(Product.getCount()>0){
	
	c.setState(c.getDispacting());
	System.out.println("dispatching after waiting  ");
	c.deliver();
	
	}

	
}


	
}
