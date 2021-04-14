public class LightOffCommand implements Command {

	Light light;

	LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}