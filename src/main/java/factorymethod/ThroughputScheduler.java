package factorymethod;

public class ThroughputScheduler implements ElevatorScheduler{

	@Override
	public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
		return 0;
	}

}
