public class ControlPanel {  
	
	// make a control panel with a single slot 
	// light on
	Command [] slots;
	
	ControlPanel(Command [] slots){
		this.slots = slots;
	}
	
	// with one slot
	void push(int index) {
		
		// call the execute function of the 
		// appropriate command in the 
		// respective slot 
		
		slots[index].execute();
	}

}
