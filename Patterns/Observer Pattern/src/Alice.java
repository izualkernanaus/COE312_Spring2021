import java.util.Date;
import java.util.Random;

public class Alice extends ConcreteObserver {
	Random r = new Random();

	// howmany belongs to the class
	static int howmany = 0;
	
	// every time new is called 
	public Alice(Subject subject) throws Exception {
		
		// when I get here it is already too laate
		// someone has called the new already!
		
		super(subject);
		
		if(howmany==1) throw (new Exception("too many alices"));
		
		howmany++;
	
		System.out.println("howmany="+howmany);
	}

	@Override
	public void update(int x, Date d) {
		// TODO Auto-generated method stub
		if (r.nextInt(100) % 10 == 0)
			System.out.println("Alice says, Oh it is so late on " + d);
		
	}
}