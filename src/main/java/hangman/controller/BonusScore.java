package hangman.controller;

public class BonusScore{
	
	/**
	* @pre debe ingresar dos variables de tipo entero
	* @param correctCount valor de la bonificacion 10 puntos.
	* @param incorrectCount valor de penalizacion -5 puntos.
	* @return Retorna un numero entre 0 y 100.
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		int puntaje=0;
		puntaje-=(incorrectCount*5);
		puntaje+=(10*correctCount);
		if(puntaje>0){
			return puntaje;
		}else{
			return 0;
		}
	}

}
