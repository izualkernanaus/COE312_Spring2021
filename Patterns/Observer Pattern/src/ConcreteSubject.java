import java.util.ArrayList;
import java.util.Date;

public abstract class ConcreteSubject implements Subject {
	protected ArrayList observers;

	// array list to store my observers
	
	public ConcreteSubject() {
		// I am creating an array list of pointers to anything
		observers = new ArrayList();
	}

	// call the update function of all the people 
	// who are my observers
	
	abstract public void notifyObservers();
	
	// add Observers to the list
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	// remove Observers from the list
	
	public void removeObsever(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}
}