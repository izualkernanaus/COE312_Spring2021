import java.util.Calendar;
import java.util.GregorianCalendar;

public class Context {
 
	// starting state is OrderedState
	// state -> current_state 
	
    private State state = new OrderedState();
    
    /* SECTION CONTAINING GLOBAL INFORMATION */
    
    // shared information -- day of week 
    // use this to make a decision on whether 
    // to go to the next state
    
    private Calendar cal = new GregorianCalendar();
    int day = cal.DAY_OF_WEEK;
    
    // global information about the package
    // booleans
    boolean PackageReady = false;
    boolean PackageProcessed = false;
 
    // previous state
    public void previousState() {
    	
    	// this means "me" which is Context
        state.prev(this);
    }
 
    // next state 
    public void nextState() {
        state.next(this);
    }
 
    // which state is active
    public void printStatus() {
        state.printStatus();
    }

public void setState(State  state) {
  this.state = state;}
}

