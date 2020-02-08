package hangman.controller;

public class OriginalScore{
	
	/**
	* @pre debe ingresar dos variables de tipo entero
	* @param correctCount valor de la puntuacion.
	* @param incorrectCount valor de penalizacion.
	* @return Retorna un numero entre 0 y 100.
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		
		int puntaje=100;
		puntaje-=(incorrectCount*10);
		return puntaje;
	}
	

}
