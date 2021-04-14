public abstract class Beverage2 implements Brew, Condiments {

	// because I want to enforce the recipe
	// my children cannot change the recipe
	// final. 

  Beverage2(){
	  
  }
  
// final makes sure that no one can change 
// the structure of the recipe. 
// still need 4 steps etc. 

// --  ENFORCES THE RECIPE 
  
final  void prepareRecipe() {
	boilWater();
	brew();
	pourInCup();
	add();
}

protected void boilWater() {
	System.out.println("Boil water.");
}
protected void pourInCup() {
	System.out.println("Pouring into cup.");
}


}
