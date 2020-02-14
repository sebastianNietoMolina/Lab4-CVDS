package hangman;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;


import hangman.controller.BonusScore;
import hangman.controller.OriginalScore;
import hangman.controller.PowerScore;


public class GameScoreTest{
	

	/**
	* Clases de equivalencia:
	* 	valores correcto:  correctCount>=0
	*	valores incorrectos: 0<=incorrectCount<=10
	* en este caso el inicio=100
	**/

	@Test
	public void originalScoreTest(){
		OriginalScore score=new OriginalScore();
		int valor = score.calculateScore(0,10);		
		Assert.assertEquals(valor,0);
		
	}
	
	/**
	* Clases de equivalencia:
	* 	valores correcto:  correctCount>=0
	*	valores incorrectos: 0<=incorrectCount<=10
	* En este caso el inicio=0.
	* 
	**/
	@Test
	public void bonusScoreTest(){
		BonusScore score=new BonusScore();
		int valor = score.calculateScore(10,0);
		Assert.assertEquals(valor,100);
		
	}
	
	/**
	* Clases de equivalencia:
	* 	valores correcto:  correctCount>=0
	*	valores incorrectos: 0<=incorrectCount<=10
	* En este caso el inicio=0.
	* 
	**/
	@Test
	public void powerScoreTest(){
		PowerScore score=new PowerScore();
		int valor = score.calculateScore(2,1);
		Assert.assertEquals(valor,17);
		
	}
}