/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.dependencyInjection;

import org.foi.uzdiz.embalint.PodaciOblici;

/**
 *
 * @author Emil
 */
public class Povrsina {
    Oblici objekt;
    String povrsina;
     
    
    public void setOblici(Oblici objekt){
        this.objekt = objekt;
    }
    
   
    public float Povrsina(PodaciOblici objekt){
        
        return this.objekt.izracunajPovrsinu(objekt);
    }
}
