package mySentiment;

import uk.ac.wlv.sentistrength.*;

public class Controller {
	
	private static String tweetPath = "data/results.csv";
	private static String dataPath = "data/fixed_normalized_data.csv";
	private static String resultPath = "data/new_normalized_data.csv";

	

	public static void main(String[] args) {
		MyAnalyser analyserInstance = new MyAnalyser();
		MyFileReader readerInstance = new MyFileReader(tweetPath,dataPath,resultPath, analyserInstance);
	}
}
