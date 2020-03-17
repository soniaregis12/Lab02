package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> dizionario = new LinkedList<>();
	
	public void addWord(String alienWord, String translation) {
		Word w = cercaWord(alienWord);
		
		if(w != null) {
			w.setTranslation(translation);
		}
		else {
			Word e = new Word(alienWord, translation);
			this.dizionario.add(e);
		}
	}
	
	public Word cercaWord(String alienWord) {
		for(Word w : this.dizionario) {
			if(w.getAlienWord().equals(alienWord)) {
				return w;
			}
		}
		return null;
	}
	
	public String translateWord(String alienWord) {
		
		Word w = cercaWord(alienWord);
		
		if(w != null) {
			return w.getTranslation();
		}else {
			return null;
		}
	}

}
