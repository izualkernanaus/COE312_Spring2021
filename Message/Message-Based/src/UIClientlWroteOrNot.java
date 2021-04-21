
public class UIClientlWroteOrNot extends UIClient{

	public UIClientlWroteOrNot(ConcreteSubject[] subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Message m) {
		System.out.println("Yes, someone wrote something");	
	}
}
