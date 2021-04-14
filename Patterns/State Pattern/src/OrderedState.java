import java.util.Calendar;

public class OrderedState implements State {

	@Override
	public void prev(Context context) {
		System.out.println("No previous state");
		
	}

	@Override
	public void next(Context context) {
		// make the package ready
		context.PackageReady = true; 
		// change state on the boolean
		if(context.PackageReady && context.day!=Calendar.FRIDAY) {
			//Deliver the package to the post office (Action)
			context.setState(new DeliveredState());
		} 
			
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("In Ordered State");
		
	}

}
