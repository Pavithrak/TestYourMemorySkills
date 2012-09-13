package org.tyms.model;

import java.util.HashMap;

import com.google.common.collect.BiMap;

public class TestSet {
	private int id;
	private String setName;
	private BiMap<String,String> wordToMeaningMatch;

	public TestSet(int id, String setName,BiMap<String, String> wordToMeaningMatch) {
		this.id = id;
		this.setName = setName;
		this.wordToMeaningMatch = wordToMeaningMatch;
	}
	
	
	
}
