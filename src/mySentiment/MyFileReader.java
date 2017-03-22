package mySentiment;

import java.io.*;

public class MyFileReader {
	private String sourceTweets;
	private String sourceData;
	private String resultPath;
	private BufferedReader myTweetReader;
	private BufferedReader myDataReader;
	private BufferedWriter myResultWritter;
	private MyAnalyser analyser;
	
	
	public MyFileReader(String sourceTweets, String sourceData, String resultPath, MyAnalyser analyser) {
		this.sourceTweets = sourceTweets;
		this.sourceData = sourceData;
		this.resultPath = resultPath;
		this.analyser = analyser;
		try {
			this.myTweetReader = new BufferedReader(new FileReader(this.sourceTweets));
			this.myDataReader = new BufferedReader(new FileReader(this.sourceData));
			this.myResultWritter = new BufferedWriter(new FileWriter(this.resultPath));
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	public void analyseDataSet() throws IOException {
		String tweetLine = "";
		String dataLine = "";
		while((tweetLine = myTweetReader.readLine()) != null) {
			dataLine = myDataReader.readLine();
			
			
			
		}
		
		
		
	}
}
