public class LightOnCommand implements Command {

	Light light; // Acts on something?

	LightOnCommand(Light light) {
		
		// saving light I am going to act on. 
		this.light = light;
	}

	public void execute() {
		
		// turn the light on 
		
		light.on(); // ACTS ON THE SOMETHING

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
