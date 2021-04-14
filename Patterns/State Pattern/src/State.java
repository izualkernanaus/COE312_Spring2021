public interface State {
	// how and when to go to the previous state
	public void prev(Context context);
	// how and when to go to the next state
	public void next(Context context);
	
	// printing
	public void printStatus();
}
