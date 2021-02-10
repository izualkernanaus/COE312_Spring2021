
public class Driver {

	// args are the argument that you pass to
	// your main program
	
	// notepad "foo.txt"
	
	// args is an array of addresses of strings
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] foo = null;
		
		System.out.println(foo);
		
		// String[10] is an array of 10 addresses
		
		foo = new String[10];
		
		foo[0]="this is how we do it";
		foo[1]= new String("another way to do it");
		
		
		for(int i=0; i<10; i++) {
			System.out.println(foo[i]);
		}
		
		System.out.println(foo);
		
	}

}
