import java.util.Date;

public class Clock extends ConcreteSubject implements Runnable {

	int ticks = 0;
	
	Clock() {
		Thread t = new Thread(this);
		t.start();
	}

	public void notifyObservers() {
		// go through the list and call the update
		// update function
		
		for (int i = 0; i < observers.size(); i++) {
			// here I need to cast it to the right class
			Observer observer = (Observer) observers.get(i);
			// update with the ticks
			
			observer.update(ticks, new Date());
			
			
		}
	}
	
	public void run() {

		while (true) {
			// tell people the time
			notifyObservers(); // ticks?

			try {
				// sleep for 1 second
				Thread.sleep(1000);
				ticks++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}