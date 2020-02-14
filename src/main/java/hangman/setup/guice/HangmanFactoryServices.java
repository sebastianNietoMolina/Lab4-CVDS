/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import hangman.controller.*;

/**
 *
 * @author 2106913
 */

import hangman.model.*;
import hangman.model.dictionary.*;
import hangman.setup.factoryMethod.*;
import hangman.view.*;
public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
    	bind(GameScore.class).to(OriginalScore.class);
    	bind(Language.class).to(Spanish.class);
    	bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
        bind(HangmanFactoryMethod.class).to(HangmanDefaultFactoryMethod.class);
        bind(HangmanPanel.class).to(HangmanColoridoPanel.class);
    	
    }

}
