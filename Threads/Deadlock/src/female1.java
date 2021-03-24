public class female1 implements Runnable {
	
	// two shared resources 
	// notebook and a pencil 
	
	String notebook;
	String pencil;
	String glass;

	Thread t;

	female1(String notebook, String pencil, String glass) {
		
		// initialize the pointers to shared resources
		
		this.notebook = notebook;
		this.pencil = pencil;
		this.glass = glass;
		
		// create a thread and run myself
		
		t = new Thread(this);
		t.start();
	}

	public void run() {
		while (true) {
			
			// wait for the notebook to become available
			synchronized (notebook) {
				
				// locked out everyone else from this notebook

				System.out.println(this + " has the notebook.");	

			}
			// you freed up the notebook
			
			// now wait for pencil to become available.
			synchronized (pencil) {
				
				// locked out everyone from grabing the pencil
				// now I have the pencil and the notebook
				
				System.out.println(this + " has the pencil.");
				System.out.println(this + " has pencil and notebook so they can write");
				System.out.println(this + " ..... writing .....");
			}
			
			// waiting for the glass
			synchronized (glass) {
				// locked the glass
				
				System.out.println(this + " is drinking water");
	
			}	
			

		}
	}
}
