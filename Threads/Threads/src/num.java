import java.util.Random;

public class num extends Thread {
  
	Random r = new Random();
	
	num(){
		// call the start in your constructor
		this.start();
	}
	
	public void run() {
		
		// cannot call start in the run 
		// because run is started by start!
		
		while(true) {
			
			// the moment you call System.out
			// the scheduler will suspend you 
			// move you to the Blocked state
			// Why?
			System.out.println(this+" prints "+r.nextInt());
		}
	}
};
