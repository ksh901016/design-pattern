package strategy.robot;

import strategy.robot.attack.MissileStrategy;
import strategy.robot.attack.PunchStrategy;
import strategy.robot.moving.FlyingStrategy;
import strategy.robot.moving.WalkingStrategy;

public class Client {
	public static void main(String[] args){
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		taekwonV.setAttackStrategy(new MissileStrategy());
		taekwonV.setMovingStrategy(new WalkingStrategy());
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		
		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
