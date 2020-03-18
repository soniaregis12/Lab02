package it.polito.tdp.alien.model;

import it.polito.tdp.alien.AlienDictionary;

public class Model {
	
	AlienDictionary a = new AlienDictionary();
	
	public String traduci(String parola) {
		
		String array[] = parola.split(" ");

	/*	for(int i = 0 ; i < parola1.length(); i++) {
			if((parola1.charAt(i) < 'a' || parola1.charAt(i) > 'Z' ) ) {
				throw new NumberFormatException("Devi inserire una parola, imbecille!");
			}
		}
		for(int j = 0 ; j < parola2.length(); j++) {
			if((parola2.charAt(j) < 'a' || parola2.charAt(j) > 'Z' ) ) {
				throw new NumberFormatException("Devi inserire una parola, imbecille!");
			}
		}
   			
		
	*/
		if(parola.contains(" ")) {
			String parola1 = array[0];
			String parola2 = array[1];
			
			if(parola1.matches("[a-zA-Z]*") && parola2.matches("[a-zA-Z]*")) {
				a.addWord(parola1, parola2);
			}
			
			return  "";
		}else {
			if(parola.matches("[a-zA-Z]*")) {
				return a.translateWord(parola);
			}else {
				int posizione = 0;
				int contatore = 0;
				for(int i = 0; i < parola.length(); i++) {
					if(parola.charAt(i) == '?') {
						contatore++;
						posizione = i;
					}
				}
				if(contatore == 1) {
					return a.translateWord(parola, posizione);
				}
				
			}
			
		}
		return null;
	}
	
	public void resetta() {
		a.deleteAll();
	}

}
