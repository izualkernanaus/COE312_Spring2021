// note book i using internal synchronization

public class notebook {
   String name;
   
   notebook(String name){
	   this.name = name;
   }

public synchronized String getName() {
	return name;
}

public synchronized void setName(String name) {
	this.name = name;
}

// to grab the whole notebook 

public synchronized void pickup(female_internal f) {
	System.out.println("Female"+f+"picked up notebook "+this);
}

}
