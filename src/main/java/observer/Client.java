package observer;

public class Client {
	public static void main(String[] args){
		ScoreRecord scoreRecord = new ScoreRecord();
		
		// 3개 까지만 출력
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		
		scoreRecord.setDataSheetView(dataSheetView);
		
		for(int index =1; index <=5; index++){
			int score = index * 10;
			System.out.println("Adding " + score);
			
			scoreRecord.addScore(score);
		}
	}
}
