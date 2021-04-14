/*
 
 If a type implements two interfaces, and each 
 interface define a method that has identical signature, 
 then in effect there is only one method, 
 and they are not distinguishable. 
 If, say, the two methods have conflicting return types, 
 then it will be a compilation error. 
 This is the general rule of inheritance, 
 method overriding, hiding, and declarations, 
 and applies also to possible conflicts not only 
 between 2 inherited interface methods, but also 
 an interface and a super class method, or even 
 just conflicts due to type erasure of generics.
 * 
 */


public interface Brew {
  void brew();
}
