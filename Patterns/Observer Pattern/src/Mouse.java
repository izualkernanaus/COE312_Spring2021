import java.util.Date;

public class Mouse extends ConcreteObserver {

public Mouse(Subject subject) {
	// I need to get registered
	super(subject);
}

public void update(int x, Date d) {
	System.out.println(this+"wee -- jumpy jump");
}

}
