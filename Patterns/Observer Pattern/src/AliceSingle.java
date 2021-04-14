import java.util.Date;
import java.util.Random;

public class AliceSingle extends ConcreteObserver {
	Random r = new Random();

	// instance variable belongs to the class. 
	private static AliceSingle instance;
	
	private AliceSingle(Subject subject) {
		super(subject);
	}

	public static synchronized AliceSingle getInstance(Subject subject){
		if(instance == null){
		instance = new AliceSingle(subject);
		}
		 return instance;
		}


	@Override
	public void update(int x, Date d) {
		// TODO Auto-generated method stub
		if (r.nextInt(100) % 10 == 0)
			System.out.println("Alice Single says, Oh it is so late on " + d);
	}
}