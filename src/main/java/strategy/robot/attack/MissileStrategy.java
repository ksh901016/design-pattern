package strategy.robot.attack;

public class MissileStrategy implements AttackStrategy{

	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it.");
	}

}