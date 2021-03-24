
public class Racket implements Runnable {

	// I need access to a Ball 
	Ball b;
	
	// All generic initializations should 
	// go in the default constructor 
	
	Racket(){
		Thread t = new Thread(this);
		t.start();
	}
	Racket(Ball b){
		// this is the right way to do this
		// we called the default constructor
		
		this(); // calls Racket()
		this.b =b;
	}
	
	
	public void run() {
		
		// why does it NOT WORK!!
		while(true) {
		if(b.state=="ping") {
			b.state="pong";
		} else if (b.state=="pong") {
			b.state="ping";
		}
		
		System.out.println(this+" changed the state "+b.state);
		}
	}

}
