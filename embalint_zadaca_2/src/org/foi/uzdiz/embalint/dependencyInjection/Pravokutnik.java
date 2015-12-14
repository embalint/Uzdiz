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
public class Pravokutnik implements Oblici{

    @Override
    public float izracunajPovrsinu(PodaciOblici objekt) {
     //   System.out.println("Pravokutnik povrsina");
       return Math.abs(Float.parseFloat(objekt.getKoordinate().get(2))- Math.abs(Float.parseFloat(objekt.getKoordinate().get(0)))) *
               Math.abs(Float.parseFloat(objekt.getKoordinate().get(3))- Float.parseFloat(objekt.getKoordinate().get(1)));
    }
    
    
}
