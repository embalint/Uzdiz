/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.fotoaparati.kompaktni;

/**
 *
 * @author Emil
 */
public class KompaktniFactory {
    public KompaktniAbstract izvadiKompaktniFactory(int fotic) {

        if (fotic == 1) {
            return new KompaktniCanon();
        } else if (fotic == 2) {
           return new KompaktniFujifilm();
        } else if (fotic == 3) {
           return new KompaktniNikon();
        } 
       
        else
            return null;
        
        

    }
    
}
