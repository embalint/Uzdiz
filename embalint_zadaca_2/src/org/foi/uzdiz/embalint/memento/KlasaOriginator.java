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
public class KlasaOriginator {
    
    private String datoteka;
	 
	    // Sets the value for the article
	     
	    public void setNovaDat(String newDatoteka) {
	        System.out.println("From Originator: Current Version of Article\n"+newDatoteka+ "\n");
	        this.datoteka = newDatoteka;
	    }
	 
	    // Creates a new Memento with a new article
	     
	    public KlasaMemento spremiUMemento() {
	        System.out.println("From Originator: Saving to Memento");
	        return new KlasaMemento(datoteka);
	    }
	        
	    // Gets the article currently stored in memento
	     
	    public String restoreFromMemento(KlasaMemento memento) {
	            
	        datoteka = memento.getSavedDatoteka();
	            
	        System.out.println("From Originator: Previous Article Saved in Memento\n"+datoteka + "\n");
	         
	        return datoteka;
	        
	    }

    
}
