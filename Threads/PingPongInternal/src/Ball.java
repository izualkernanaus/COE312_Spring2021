
public class Ball {
	
	// state private so cannot be accessed directly
	
	private String state = "ping";

	// create a get 
	// put a door on it by using synchronized
	
	public synchronized String getState() {
		return state;
	}

	// create a set and 
	// put a door on it by using synchronized 
	
	public synchronized void setState(String state) {
		this.state = state;
	}
	
}
