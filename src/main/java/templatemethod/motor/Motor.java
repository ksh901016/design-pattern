package templatemethod.motor;

public abstract class Motor {
	private Door door;
	private MotorStatus motorStatus;
	
	public Motor(Door door){
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	// LGMotor와 HyundaiMotor의 move 메서드에서 공통되는 부분만을 가짐
	public void move(Direction direction){
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPEND)
			door.close();
		
		moveMotor(direction); // 이 메서드는 HyundaiMotor와 LGMotor에서 특수화(오버라이드 됨)
		setMotorStatus(MotorStatus.MOVING);
	}
	
	protected abstract void moveMotor(Direction direction);
}
