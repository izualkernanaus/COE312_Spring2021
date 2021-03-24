// note pencil i using internal synchronizatioin
public class pencil {
   String name;
   
   pencil(String name){
	   this.name = name;
   }

public synchronized String getName() {
	return name;
}

public synchronized void setName(String name) {
	this.name = name;
}

public synchronized void pickup(female_internal f) {
	System.out.println("Female"+f+"picked up pencil "+this);
}
   
}