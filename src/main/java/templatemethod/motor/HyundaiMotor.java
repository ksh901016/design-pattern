package templatemethod.motor;

public class HyundaiMotor extends Motor{

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("현대엘리베이터가" + direction +"으로 올라갑니다.");
	}

}
