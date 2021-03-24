
public class Racket implements Runnable {
	Ball b;

	Racket(Ball b) {
		this.b = b;

		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		
		while (true) {
		
			synchronized(b) {
				if (b.state == "ping")
					b.state = "pong";
				else if (b.state == "pong")
					b.state = "ping";

			System.out.println(this + " state=" + b.state);
			}
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}
}

