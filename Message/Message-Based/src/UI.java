import java.util.Scanner;

public class UI extends ConcreteSubject implements Runnable{

	UI(){
		Thread t = new Thread(this);
		t.start();
	}
	
	// called by people who want to talk to the 
	// person playing the game. 
	
	void UIWrite(String s) {
		System.out.println(s);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
        
		// reading the white window an sending 
		// that out as a message 
		
		while(true) {
			
		Message m = new Message(this, "UI", in.nextLine());
		
		publishMessage(m);
		
		}      
		
	}
	

}
