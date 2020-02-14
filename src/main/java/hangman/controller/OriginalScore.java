package hangman.controller;

public class OriginalScore{
	
	/**
	* @pre debe ingresar dos variables de tipo entero
	* @param correctCount jugas que hacerto.
	* @param incorrectCount jugadas incorrectas.
	* @return Retorna un numero entre 0 y 100.
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		
		int puntaje=100;
		puntaje-=(incorrectCount*10);
		if(puntaje>0){
			return puntaje;
		}else{
			return 0;
		}
		
	}	

}
