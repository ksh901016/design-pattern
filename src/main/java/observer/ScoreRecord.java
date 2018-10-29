package observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
	// 입력된 점수를 저장하는 클래스
	private List<Integer> scores = new ArrayList<Integer>(); 
	
	public void addScore(int score){
		scores.add(score);
		
		// 데이터가 변경되면 Subject 클래스의 notifyObservers 메서드를 호출해
		// 데이터의 변경을 통보함
		notifyObservers();
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
