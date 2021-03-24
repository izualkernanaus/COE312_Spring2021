
public class Racket implements Runnable {
	Ball b;

	Racket(Ball b) {
		this.b = b;

		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			
			// need to use the get and the 
			// the set to access the state 
			// of the shared ball 
			
			if (b.getState() == "ping")
				b.setState("pong");
			else if (b.getState()== "pong")
				b.setState("ping");

			System.out.println(this + " state=" + b.getState());
		}
	}
}
