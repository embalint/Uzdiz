/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.memento;

import java.util.ArrayList;

/**
 *
 * @author Emil
 */
public class KlasaCaretaker {
    
    // Where all mementos are saved
	     
	    ArrayList<KlasaMemento> savedDatoteke = new ArrayList<KlasaMemento>();
	 
	    // Adds memento to the ArrayList
	     
	    public void addMemento(KlasaMemento m) { savedDatoteke.add(m); }
	    
	    // Gets the memento requested from the ArrayList
	     
	    public KlasaMemento getMemento(int index) { return savedDatoteke.get(index); }

    
}
