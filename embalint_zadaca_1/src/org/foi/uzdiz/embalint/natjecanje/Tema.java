/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.natjecanje;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Emil
 */
public class Tema {
    int brkat;
    Random randomGenerator = new Random();
    ArrayList<Integer> vrste_kategorija;
    int bodovi;
    ArrayList<KategorijaFactory> lista_kategorija = new ArrayList<>();
    String nazivTeme;
    
  
    KategorijaFactory objekt;
    Tema(int brKatNat) {
        this.vrste_kategorija = new ArrayList<>();
        this.brkat = brKatNat;
        
       
    }
    
    public void odredivanjeKategorije(String nazivTeme,int brojKat,int brNatjecatelja){
        this.nazivTeme = nazivTeme;
        if(brkat ==3){
            //pozovi sve 3 kategorije
            vrste_kategorija.add(1);
            vrste_kategorija.add(2);
            vrste_kategorija.add(3);
        }
        else if(brkat == 2){
            int gen1 = randomGenerator.nextInt(3)+1;
            int gen2 = randomGenerator.nextInt(3)+1;
            while(gen1 == gen2){
                gen2 = randomGenerator.nextInt(3)+1; // generira novi random jer su nekad jednaki
            }
            vrste_kategorija.add(gen1);
            vrste_kategorija.add(gen2);
        }
        else {
            int gen  = randomGenerator.nextInt(3)+1;
            vrste_kategorija.add(gen);
        }
        for(Integer vrste:vrste_kategorija){
            
            
            
            // prosljedi vrste kao parametar u klasu za izbor kategorija
            objekt = new KategorijaFactory(nazivTeme,brojKat,brNatjecatelja,vrste); // vise puta instanciram kategoriju, Moram slozit klasu kategorija, u vrsti se nalaze brojevi koje kategorije instanciram
            lista_kategorija.add(objekt);
            bodovi+= objekt.bodovanje.bodovi;
            
        }
        
        
        
    }
    
    
   
}
