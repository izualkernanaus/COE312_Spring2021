
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// create a ball
		Ball b = new Ball();
		
		// create two rackets
		// both rackets share the ball 
		
		Racket r1 = new Racket(b);
		Racket r2 = new Racket(b);
		Racket r3 = new Racket(b);
		Racket r4 = new Racket(b);


	}

}
