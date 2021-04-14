import java.util.Date;

// generic update -- this is the function that
// the Subject will call when data becomes available. 

public interface Observer {
 void update(int x, Date d);
}
