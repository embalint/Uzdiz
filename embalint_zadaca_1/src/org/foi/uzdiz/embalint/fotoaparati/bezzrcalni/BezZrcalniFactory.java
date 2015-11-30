/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.fotoaparati.bezzrcalni;



/**
 *
 * @author Emil
 */
public class BezZrcalniFactory {
    public BezZrcalniAbstract izvadiKompaktniFactory(int fotic) {

        if (fotic == 1) {
            return new BezZrcalniPentax();
        } else if (fotic == 2) {
           return new BezZrcalniFujifilm();
        } else if (fotic == 3) {
           return new BezZrcalniSony();
        } 
       
        else
            return null;
        
        

    }
    
}
