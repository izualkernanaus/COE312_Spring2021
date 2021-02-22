// not need to say #include <animal.cpp>
// YES -- for every class we need a separate file



public class Driver {

	public static void main(String[] args) {
       
	 /*
       // create an instance of an animal
       // in a final exam this is a FAT F.
	
		
	   // we CANNOT create instances of an Animal
	   // it does not make sense!!
		
        Animal a1 = new Animal(); // illegal !
       System.out.println(a1.age);
       System.out.println(a1.weight);
       
       // create an animal with 10 years of age and 300 kg weight 
       Animal a2 = new Animal(10, 300); // illegal !
       
      // No delete -- Don't need it!
       
       */
	
	  // create a snake
		
	 /*
	  Snake s = new Snake();
	  System.out.println(s.age);  
	 */
		
	  Cobra c = new Cobra();
	  //System.out.println(c.poison_strength);
	  
	  
	  // Rattle snake 2 years old
	  
	  Rattle r = new Rattle(1, 2);
	  //System.out.println("age="+r.age+", weight="+r.weight);
	  
	  
	  //print instance of rattle snake
	  
	  System.out.println(r); //calls the toString function of r
	  
	  // Create an array that contains
	  // some snakes, some cats, some whales
	  
	  // create an array of animals
	  
	  //anims is an array of addresses of Animals
	  //polymorphism
	  
	  Animal [] anims = {new Whale(),new Cat(), new Mamba()};
	  
	  // print all the animals in this array
	  
	  for(int i =0; i<anims.length; i++) {
		  System.out.println(anims[i]);
	  }
	  
	  Animal a; 
	  
	  // Animal address on left side, and Cat Address on the right side
	  // it works! polymorphism
	  
	  a = new Cat(); 
	  System.out.println(a);
	  
	  Cat d;  
	  d = (Cat) new Mamal();
	  
	  
	  
	}

}
