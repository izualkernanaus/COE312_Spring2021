
// just like C++ we have a class name
// neme is hello

public class Hello {

	// the main function is INSIDE one class
	// in C++ main was floating around
	// One program running can only have one main just like C++
	
	public static void main(String[] args) {
		
	// cout << "hello world!"
		
	   System.out.println("hello world from java");
	
	 // int is just like C++ -- this is a primitive variable
	 // &x I cannot do this in Java. 
	   
	   int x = 10;
	   
	   // cout << x;
	   System.out.println(x);
	   
	  // Integer is ?
	  
	  // -- Integer is a dog
	  //    -- Integer is the same as if we said int *
	  // -- Integer is the same as int
	   
	   
	   
	   // Java does not have pointers == Almost everything in Java
	   // is a pointer 
	   // "because everthing is the same as nothing"
	   
	   // int * y;  -- y is an address of an Integer class
	   //           -- y is a pointer to an Integer class
	   
	   
	   Integer y;
	   
	   // *y = 20
	   
	   // dog on the left side -- number on the right side
	   
	   y = 20;
	   
	   y = new Integer(30);
	   
	   System.out.println(y);
	   
	   
	   // why did we have to initialize z to null
	   // and what is z?
	   
	   // z is a variable that holds the address of an 
	   // integer
	   
	   Integer z = null;
	   
	   z = new Integer(50);
	   
	   // confusing
	   
	   // this should not work because
	   // LHS == address 
	   // RHS == number 
	   
	   
	   z = -5; // what actually happens is 
	           // z = new Integer(-5);

	   
	   System.out.println(z);
	   
	   // s is an address of an instance of a String
	   
	   // C++ this would be string * s;
	   
	   String s = null;
	   
	   s = "this is soo silly";
	   
	   // this actually does s = new String("this is soo silly")
	   
	   
	   System.out.println(s);
	   
	   
	   
	}

}
