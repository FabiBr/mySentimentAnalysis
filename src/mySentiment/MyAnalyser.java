package mySentiment;

import uk.ac.wlv.sentistrength.*;

public class MyAnalyser {
	
	private SentiStrength myAnalyser;

	public MyAnalyser() {
		myAnalyser = new SentiStrength();
		String ssthInitialisation[] = { "sentidata", "lib/SentiStrength_data/", "explain" };
		myAnalyser.initialise(ssthInitialisation);
	}
	
	public int[] analyseSentence(String sentence) {
		String result = myAnalyser.computeSentimentScores(sentence);
		String[] tokens = result.split(" ");
		
		int[] resultNum = new int[2];
		int pos = Integer.parseInt(tokens[0]);
		int neg = Integer.parseInt(tokens[1]);
		resultNum[0] = Math.abs(pos);
		resultNum[1] = Math.abs(neg);
		return resultNum;	
	}
	
	
	
}
