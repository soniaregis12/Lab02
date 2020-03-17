package it.polito.tdp.alien;

import java.util.*;

public class Word {
	
	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public boolean equals(Object o) {
		if(this.alienWord.toLowerCase().equals(o.toString().toLowerCase())) {
			return true;
		}
		return false;
	}
	
	

}
