package factorymethod;

public class Client {
	public static void main(String[] args){
		ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
		emWithResponseTimeScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
		emWithThroughputScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithDynamicSchedulerr = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
		emWithDynamicSchedulerr.requestElevator(10, Direction.UP);
	}
}
