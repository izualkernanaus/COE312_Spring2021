
// snake is NOT abstract -- Concrete Class

public abstract class Snake extends Reptile implements Pet {

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
	
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dispense_poison() {
		// TODO Auto-generated method stub
		
	}
	
}
