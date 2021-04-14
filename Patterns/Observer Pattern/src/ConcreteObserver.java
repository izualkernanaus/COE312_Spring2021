import java.util.Date;

public abstract class ConcreteObserver implements Observer {

	// need a pointer to the Subject who is generating 
	// data
	
	private Subject subject;

	
	// I need to register myself (this) with the 
	// Subject
	
	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	// provide an implementation of the update function. 
	
	abstract public void update(int x, Date d);

	
}