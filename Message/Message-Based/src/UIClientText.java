
public class UIClientText extends UIClient {

	public UIClientText(ConcreteSubject[] subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Message m) {
		System.out.println("Text "+m.payload+" received from "+m.origin);	
	}
}
