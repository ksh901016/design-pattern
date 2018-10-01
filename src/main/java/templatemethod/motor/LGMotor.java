package templatemethod.motor;

public class LGMotor extends Motor{

	public LGMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("LG엘리베이터가" + direction +"으로 올라갑니다.");
	}

}
