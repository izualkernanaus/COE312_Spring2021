public class female_internal implements Runnable {
	
	// two shared resources 
	// notebook and a pencil 
	
	notebook n1;
	pencil p1;

	Thread t;

	female_internal(notebook n, pencil p) {
		
		// initialize the pointers to shared resources
		
		n1 = n;
		p1 = p;
		
		// create a thread and run myself
		
		t = new Thread(this);
		t.start();
	}

	public void run() {
		while (true) {
			
			    /*  THIS DOES NOT WORK */
			    /*  YOU HAVE TO USE EXTERNAL SYNCHRONIZATION" */
			    
			    // notebook
			    
				n1.pickup(this); // released it
				// pencil 
				p1.pickup(this); // released it
				
				
				// write -- you dont have notebook or pencil
				System.out.println(this+" writing");
				

		}
	}
}

