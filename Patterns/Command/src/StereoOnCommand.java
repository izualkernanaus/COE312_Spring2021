public class StereoOnCommand implements Command {
	
	private Stereo stereo;

	public StereoOnCommand(Stereo stereo){
		this.stereo = stereo;
	}

	public void execute() {  
		stereo.on();  
		stereo.settrack("Wish you were here");  
		stereo.setvolume(1);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}

}