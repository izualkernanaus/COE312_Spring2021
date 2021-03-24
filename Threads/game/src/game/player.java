package game;

import java.util.Random;


public class player implements Runnable  {

	player(){
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		Random r = new Random();
		
		while(true) {
			System.out.println(Thread.currentThread().getId());
			System.out.println(r.nextInt(1000));
		}
		
	}

}
