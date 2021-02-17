
// snake is NOT abstract -- Concrete Class

public abstract class Snake extends Reptile {

	float poison_strength;
	
	// default 
	Snake(){
		poison_strength=0;
	}
	
	// non-default
	Snake(float poison){
		this.poison_strength = poison;
	}

	public Snake(float weight, float age) {
		// TODO Auto-generated constructor stub
		super(weight, age);
	}
	
	
}
