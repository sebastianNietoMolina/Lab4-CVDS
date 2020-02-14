package hangman.controller;

public class PowerScore implements GameScore{
	
	/**
	* @pre debe ingresar dos variables de tipo entero
	* @param correctCount valor de la bonificacion 5^i con i como la iesima posicion puntos.
	* @param incorrectCount valor de penalizacion -8 puntos.
	* @return Retorna un numero entre 0 y 500.
	**/
	public int calculateScore(int correctCount, int incorrectCount){
		int puntaje=0;
		for (int i=1; i<=correctCount; i++){
			puntaje=(int) Math.pow(5,i);
		}
		if(puntaje>500){
			puntaje=500;
		}
		puntaje-=(8*incorrectCount);
		if(puntaje>0){
			return puntaje;
		}else{
			return 0;
		}
	}

}