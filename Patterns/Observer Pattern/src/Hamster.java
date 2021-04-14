import java.util.Date;

public class Hamster extends ConcreteObserver{

	public Hamster(Subject subject) {
		super(subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int x, Date d) {		
		System.out.println(this+"tick was "+x);
		System.out.println(this+"hamsery jump ");
	}


}
