package observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer{
	private ScoreRecord scoreRecord;
	
	public MinMaxView(ScoreRecord scoreRecord){
		this.scoreRecord = scoreRecord;
	}
	
	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayMinxMax(record);
	}

	private void displayMinxMax(List<Integer> record) {
		int min = Collections.min(record);
		int max = Collections.max(record);
		System.out.println("Min : " + min + " Max : " + max);
	}
	
}
