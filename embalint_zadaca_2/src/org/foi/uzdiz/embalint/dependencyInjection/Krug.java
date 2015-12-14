/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.dependencyInjection;

import org.foi.uzdiz.embalint.PodaciOblici;
import org.foi.uzdiz.embalint.dependencyInjection.Oblici;

/**
 *
 * @author Emil
 */
public class Krug implements Oblici{

    @Override
    public float izracunajPovrsinu(PodaciOblici objekt) {
        
        //izracun povrsine
       // System.out.println("krug povrsina");
        
        //easy
       return (float) Math.abs(Integer.parseInt(objekt.getKoordinate().get(2))* Integer.parseInt(objekt.getKoordinate().get(2))
               * Math.PI);
    }
    
}
