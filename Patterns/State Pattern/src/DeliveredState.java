import java.util.Calendar;

public class DeliveredState implements State {

	@Override
	public void prev(Context context) {
		System.out.println(" Cannot go back to the ordered state");

	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		// make the package ready
		context.PackageProcessed = true;
		// change state on the boolean
		if(context.PackageProcessed && context.day!=Calendar.FRIDAY && context.day!=Calendar.SATURDAY)

		context.setState(new ReceivedState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("in Delivered state");
	}

}
