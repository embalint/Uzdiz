/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.natjecanje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javafx.print.Collation;
import org.foi.uzdiz.embalint.GlavnaKlasa;

/**
 *
 * @author Emil
 */
public class Pravilo2 {
    ArrayList<Integer> suci = new ArrayList<>();
    public int bodovanje(){
        Random generator = new Random();
        int bodovi = 0;
        for(int i = 0 ; i<GlavnaKlasa.brojZiria;i++){
            suci.add(generator.nextInt(11));
        }
        Collections.sort(suci);
        suci.remove(0);
        suci.remove(GlavnaKlasa.brojZiria-1);
        for(int i= 0 ; i< suci.size()-1;i++){
            bodovi+=suci.get(i);
        }
        return bodovi;
    }
    
}
