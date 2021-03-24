public class female_student implements Runnable {
	
	// two shared resources 
	// notebook and a pencil 
	
	String notebook;
	String pencil;

	Thread t;

	female_student(String notebook, String pencil) {
		
		// initialize the pointers to shared resources
		
		this.notebook = notebook;
		this.pencil = pencil;
		
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

				// now wait for pencil to become available.
				synchronized (pencil) {
					
					// locked out everyone from grabing the pencil
					// now I have the pencil and the notebook
					
					System.out.println(this + " has the pencil.");
					System.out.println(this + " has pencil and notebook so they can write");
					System.out.println(this + " ..... writing .....");
				}

			}

		}
	}
}