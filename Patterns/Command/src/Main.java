
public class Main {

	public static void main(String[] args) {

	// create the command
	
	// create the object to act on
	Light l1 = new Light();
	
	// create the command itself
    LightOnCommand lc1 = new LightOnCommand(l1);
    LightOffCommand lc2 = new LightOffCommand(l1);
    
    
    // create the object to act on
    Stereo s1 = new Stereo();
 	
 	// create the command itself
    StereoOnCommand lc3 = new StereoOnCommand(s1);
    StereoOffCommand lc4 = new StereoOffCommand(s1);
     
    
    //creating an array of commands
    Command [] commands = {lc1, lc2, lc3, lc4};
    
    // create the control panel with the commands
    ControlPanel c = new ControlPanel(commands);
	
    final int stereo_on = 2;
    // simulate pushing the button
    c.push(0);
    c.push(1);
    c.push(stereo_on);
    c.push(3);
}

}
