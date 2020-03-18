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
			}else{
				
				
			}
		}
		return null;
	}
	
	public String translateWord(String alienWord) {
		
		if(cercaWord(alienWord) != null) {
			return cercaWord(alienWord).getTranslation();
		}else {
			return null;
		}
	}
	
	public String translateWord(String alienWord, int pos) {
		String sub1 = alienWord.substring(0, pos);
		String sub2 = alienWord.substring(pos+1);
		
		for(Word w : this.dizionario) {
			if(w.getAlienWord().substring(0,pos).equals(sub1) && w.getAlienWord().substring(pos+1).equals(sub2) && w.getAlienWord().length() == alienWord.length() )  {
				return w.getTranslation();
			}
		}
		return null;
	}

	public void deleteAll() {
		this.dizionario.clear();
	}

}
