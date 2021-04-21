public class MoreComplexObserver extends ConcreteObserver implements Runnable {

	public MoreComplexObserver(ConcreteSubject[] subjects) {
		super(subjects);
		
		Thread t = new Thread(this);
		t.start();
	}

	private String speaking = "";
	private String time = "";
	private Object origin=null;
	
	// Update is other people sending me 
	// messages
	
	@Override
	public synchronized void update(Message m) {
		
		//System.out.println("received a "+ m.payload+" message from "+m.origin);
		
		if(m.topic=="time") {
			
			 time = m.payload;
			 origin = m.origin;
			
		}
		else if(m.topic =="speaking") {
			
			speaking = m.payload; // yes Not no. 
		}
	}
	
	// Use variables like "speaking" to communicate betweeen 
	// what others are saying and what you need to do.
	
	
	// Observer's Own Behavior
	@Override
	public void run() {
		while(true) {
			try {
				speaking = "no";
				
				// sleep for 5 seconds
				
				Thread.sleep(5000);		
				System.out.println("The last click from clock "+origin+" was at "+time);
				if(speaking=="no") {
					System.out.println("No one spoke during the last 5 seconds");
					
				} else {
					System.out.println("Someone spoke during the last 5 seconds");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
