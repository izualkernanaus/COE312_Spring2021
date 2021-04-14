public class ReceivedState implements State {

	@Override
	public void prev(Context context) {
		// TODO Auto-generated method stub
		System.out.println(" Cannot go back to the delivered");
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		System.out.println(" Cannot go forward -- package rcvd");
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println(" package rcvd");
	}

}
