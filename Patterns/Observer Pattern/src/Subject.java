// generating data or infomation
// they need to register observers
// remove observers
// they notifyObservers by calling their update function
// when data gets available. 

public interface Subject {
public void registerObserver(Observer o);
public void removeObsever(Observer o);
public void notifyObservers();
}