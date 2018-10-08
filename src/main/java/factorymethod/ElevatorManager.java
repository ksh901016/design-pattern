package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	// 주어진 수 만큼의 ElevatorController를 생성함
	public ElevatorManager(int controllerCount){
		controllers = new ArrayList<>(controllerCount);
		
		for(int i=0; i<controllerCount; i++){
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}
	
	void requestElevator(int destination, Direction direction){
		// ThroughputScheduler를 이용해 엘리베이터를 선택함
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
