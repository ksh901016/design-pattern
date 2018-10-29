package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject { // 추상화된 변경 관심 대상 데이터
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyObservers(){ // 각 옵저버에게 변경을 통보함
		for(Observer o : observers){
			o.update();
		}
	}
}
