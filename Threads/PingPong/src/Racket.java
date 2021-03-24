
public class Racket implements Runnable {
	
	// need a pointer to the ball 
	
	Ball b;

	// constructor initializes the pointer 
	
	Racket(Ball b) {
		this.b = b;

		// create own thread and start it.
		
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			// state of the ball was available direclty
			if (b.state == "ping")
				b.state = "pong";
			else if (b.state == "pong")
				b.state = "ping";

			System.out.println(this + " state=" + b.state);
		}
	}
}

