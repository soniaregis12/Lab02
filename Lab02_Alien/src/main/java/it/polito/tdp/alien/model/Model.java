package it.polito.tdp.alien.model;

import it.polito.tdp.alien.AlienDictionary;

public class Model {
	
	AlienDictionary a = new AlienDictionary();
	
	public String traduci(String parola) {

		String array[] = parola.split(" ");
		String parola1 = array[0];
		String parola2 = array[1];

	/*	for(int i = 0 ; i < parola1.length(); i++) {
			if((parola1.charAt(i) <= 'a' || parola1.charAt(i) >= 'Z' ) ) {
				throw new NumberFormatException("Devi inserire una parola, imbecille!");
			}
		}
		for(int j = 0 ; j < parola2.length(); j++) {
			if((parola2.charAt(j) <= 'a' || parola2.charAt(j) >= 'Z' ) ) {
				throw new NumberFormatException("Devi inserire una parola, imbecille!");
			}
		}
   	*/		
		if(parola.contains(" ")) {
			a.addWord(parola1, parola2);
			return  "";
		}else {
			return a.translateWord(parola);
		}
	}
	
	public void resetta() {
		a.deleteAll();
	}

}
