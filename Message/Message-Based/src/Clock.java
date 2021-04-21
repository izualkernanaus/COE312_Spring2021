import java.util.Date;

public class Clock extends ConcreteSubject implements Runnable, Observer {

	int tick;
	boolean send=true;
	
	Clock(int tick) {
		this.tick = tick;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		System.out.println(this+" clock started");
		
		while (true) {
			
			// the topic is "time" and payload is "Date"
			
			Message m = new Message(this, "time", new Date().toString()); 
	
//			if (send) publishMessage(m);
			publishMessage(m);

			try {
				Thread.sleep(1000*tick);
				send=true;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public synchronized void update(Message m) {
		send = false;
		
	}
}