public class CatDriver {

public static void main(String[] args) throws Exception {

// Clock is the subject
Clock c1 = new Clock();

//// Hamster is an observer
// new Hamster(c1);
// 
//// Mouse is an observer
// new Mouse(c1);
// 
//// Rat is an observer
// new Rat(c1);

// Alice
 
 new Alice(c1); // only allow one ALICE!!!
 

// Alice Single
 
 AliceSingle.getInstance(c1);
 
 
}
}
