import java.util.Scanner;

public class Customer1 implements Observer, DisplayElement {
	
	private float orderPrice;
	
	private Subject subject;
	
	Context c;
	
	public Customer1(Subject subject) {
		 c=new Context();
		
	System.out.println("Do you(customer1) want to be notified when price is changed? Y for yes, N for no");
	Scanner input=new Scanner(System.in);
	String answer=input.nextLine();
	 if(answer.equalsIgnoreCase("y")){

			this.subject= subject;
			subject.registerObserver(this);
			}
	 else{
		 System.out.println("Customer1 check yourself!");
	 }
	 
	
	
	}

	
	public void update(float orderprice) {
	this.orderPrice=orderprice;
	display();
	}
	
	
	
	public void display() {
	System.out.println("Customer1 see price of order as  "+orderPrice);
	}


	@Override
	public void buy() {
	
		if(c.getState()==c.Waiting){
			c.cargo();
			
			
		}
		else{
		c.afterchecking();}
		
		}  
	
	

}
