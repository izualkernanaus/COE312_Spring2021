import java.util.Random;

public class num_new implements Runnable {

	Random r = new Random();
	
	num_new(){
		
		// how do I start a thing -- Runnable!
		// I cannot start Runnable 
		// to start Runnbale, I need to attach a Thread
		// to myself and then start the thread. 
		
		
		// created a thread and attached the thread 
		// to myself (this)
		
		Thread t = new Thread(this);
		
		t.start();
		
		//t.start will call my run() function below. 
	}
	@Override
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

}
