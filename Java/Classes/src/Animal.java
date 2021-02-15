
public abstract class Animal {
   String gender;
   
   // this is an address which is automatically initialized to null
   Float weight;
   
   // this is not an address and will initialize to 0
   float age;
   
   // default constructor -- no arguments - now I have to add one 
   
   Animal(){
	
	   this.weight = (float) 10;
	   this.age= 1;
	   
   }
   
   // one non-default constructor -- it takes argument
   
   Animal(float weight, float age){
	   
	   // set my weight to weight with was passed to the function
	   this.weight = weight;
	   
	   // set my age to the age which was passed to the function
	   
	   this.age= age;
   }

}
