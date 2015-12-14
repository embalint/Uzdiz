/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.memento;

/**
 *
 * @author Emil
 */
public class KlasaMemento {
    
     private String datoteka;

	     
	    public KlasaMemento(String datotekaSave) { datoteka = datotekaSave; }

	    public String getSavedDatoteka() { return datoteka; }

    
}
