package observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	// 입력된 점수를 저장하는 클래스
	private List<Integer> scores = new ArrayList<Integer>(); 
	private DataSheetView dataSheetView;
	
	public void setDataSheetView(DataSheetView dataSheetView){
		this.dataSheetView = dataSheetView;
	}
	
	public void addScore(int score){
		scores.add(score);
		dataSheetView.update(); // scores가 변경됨을 통보
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
