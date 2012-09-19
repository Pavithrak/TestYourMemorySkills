package org.tyms.model;

import com.google.common.collect.BiMap;

public class TestSet {
	private int id;
	private String testSetName;
	private BiMap<String,String> wordToMeaningMatch;
 
	public TestSet(int id, String testSetName,BiMap<String, String> wordToMeaningMatch) {
		this.id = id;
		this.testSetName = testSetName;
		this.wordToMeaningMatch = wordToMeaningMatch;
	}

	public int getId() {
		return id;
	}

	public String getSetName() {
		return testSetName;
	}

	public void setTestSetName(String setName) {
		this.testSetName = setName;
	}

	public BiMap<String, String> getWordToMeaningMatch() {
		return wordToMeaningMatch;
	}

	public void setWordToMeaningMatch(BiMap<String, String> wordToMeaningMatch) {
		this.wordToMeaningMatch = wordToMeaningMatch;
	}
}
