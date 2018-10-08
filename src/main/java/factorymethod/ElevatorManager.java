package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	// 주어진 수 만큼의 ElevatorController를 생성함
	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID){
		controllers = new ArrayList<>(controllerCount);
		
		for(int i=0; i<controllerCount; i++){
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		this.strategyID = strategyID;
	}
	
	void requestElevator(int destination, Direction direction){
		// 주어진 전략 ID에 해당되는 ElevatorScheduler를 사용함
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
