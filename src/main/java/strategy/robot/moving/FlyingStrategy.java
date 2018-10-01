package strategy.robot.moving;

public class FlyingStrategy implements MovingStrategy{

	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
