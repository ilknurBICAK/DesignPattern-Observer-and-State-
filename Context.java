
public class Context  {

    State Checking;
	State Waiting;
	State Dispacting;
	State Deliver;
	State state;
	
	public Context(){
		
		Checking=new Checking();
		Waiting=new Waiting();
		Dispacting=new Dispacthing();
		Deliver=new Deliver();
		state=Checking;
}
	
	public void afterchecking()  {
		state.afterchecking(this);
			
	}

	
	public void cargo() {
		state.cargo(this);
		
		
		
	}
	
	public void deliver(){
		state.deliver(this);
	}

	
	void setState(State state) {
		this.state = state;
		}
	
	

	public State getChecking() {
		return Checking;
	}

	public void setChecking(State checking) {
		Checking = checking;
	}

	public State getWaiting() {
		return Waiting;
	}

	public void setWaiting(State waiting) {
		Waiting = waiting;
	}

	public State getDispacting() {
		return Dispacting;
	}

	public void setDispacting(State dispacting) {
		Dispacting = dispacting;
	}

	public State getDeliver() {
		return Deliver;
	}

	public void setDeliver(State deliver) {
		Deliver = deliver;
	}

	
	public State getState() {
		return state;
	}





	
	
	
}
