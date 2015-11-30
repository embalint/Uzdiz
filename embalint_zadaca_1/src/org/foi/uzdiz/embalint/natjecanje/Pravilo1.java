/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.natjecanje;

import java.util.ArrayList;
import java.util.Random;
import org.foi.uzdiz.embalint.GlavnaKlasa;

/**
 *
 * @author Emil
 */
public class Pravilo1 {
    ArrayList<Integer> suci = new ArrayList<>();
    public int bodovanje(){
        Random generator = new Random();
        int bodovi = 0;
        for(int i = 0 ; i<GlavnaKlasa.brojZiria;i++){
            suci.add(generator.nextInt(11));
            bodovi+= suci.get(i);
        }
        return bodovi;
    }
}
