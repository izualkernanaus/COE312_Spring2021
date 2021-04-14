import java.util.Date;

public class Rat extends ConcreteObserver{

	int counter = 0;
	
	public Rat(Subject subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}


	// clock will call this function once every 
	// second
	
	public void update(int x, Date d) {
		counter++;
		if(counter==5) {
			System.out.println("squeek after every 5 seconds " + this);
			counter = 0;
		}
		System.out.println(this+"received the date" + d);
	}

}
