public class print implements Runnable {
	
	int n;
	Thread t;

    print(int n){
	    this.n = n;
	    t = new Thread(this);
	    t.start();
    }
    
    Thread get_thread() {
    	return t;
    }
    public void run() {
    for(int i =1; i<=n; i++)
    	System.out.println("from:"+this+" print "+i);
    }

     
 }