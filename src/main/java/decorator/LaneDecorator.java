package decorator;

public class LaneDecorator extends DisplayDecorator{

	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	
	public void draw(){
		super.draw(); // 설정된 기존 표시 기능을 수행
		drawLine();   // 추가적으로 차선을 표시
	}
	
	private void drawLine(){
		System.out.println("\t차선 표시");
	}
}
