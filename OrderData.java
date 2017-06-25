import java.util.ArrayList;

public class OrderData implements Subject
{
private ArrayList observers;

public OrderData() {
	
	
     observers = new ArrayList();
}

public void registerObserver(Observer o) {
observers.add(o);
}

public void removeObserver(Observer o) {
int i = observers.indexOf(o);
if (i >= 0) {
observers.remove(i);
}
}


public void notifyObservers() {
	
for (int i = 0; i < observers.size(); i++) {
Observer observer = (Observer)observers.get(i);
observer.update(Product.getPrice());
}
}


public void setMeasurements(float orderprice) {
	Product.setPrice(orderprice);
	
	notifyObservers();
}
 

}