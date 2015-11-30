/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.fotoaparati.dslr;

/**
 *
 * @author Emil
 */
public class DslrFactory {



    public DslrAbstract izvadiDslrFactory(int fotic) {

        if (fotic == 1) {
            return new SonyDslr();
        } else if (fotic == 2) {
           return new CanonDslr();
        } else if (fotic == 3) {
           return new Pentax();
        } 
       
        else
            return null;
        
        

    }
    
}
