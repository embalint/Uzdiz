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
public class Natjecatelj {
    int maxbroj_tema;
    int maxbroj_kategorija;
    int brTemaNat = 0 ;
    int brNatjecatelja;
    int bodovi;
    int max_bodovi=0;
    ArrayList<Tema> teme;
 
    public void prijava(int broj_tema,int broj_kategorija,int brojNatjecatelja){
        this.maxbroj_tema = broj_tema;
        this.maxbroj_kategorija = broj_kategorija;
        this.brNatjecatelja= brojNatjecatelja;
        Random randomGenerator = new Random();
        String[] poljeTeme ={"portret","priroda","sport","obrazovanje","glazba","promet","ljudi","zivotinje",
        "zvijezde", "umjetnost"};
        ArrayList<String> listaTema = new ArrayList<>();
        
        
     
          
                brTemaNat=randomGenerator.nextInt(maxbroj_tema)+1;
            
          //System.out.println("Korisnik se moze max prijavit na : "+brTemaNat+ " tema");
        int brKatNat=0;
        teme = new ArrayList<>();
        
        for (int i= 0;i<brTemaNat;i++){
            // promijeniti ovaj random u seed, sada je ovako samo radi testiranja
   
            brKatNat=randomGenerator.nextInt(maxbroj_kategorija)+1;
      
            Tema temObj = new Tema(brKatNat);
            teme.add(temObj);
            
            
        }
        
      
        // ispis liste
           for (int i= 0;i<brTemaNat;i++){
               
               int var = randomGenerator.nextInt(10);
               String nazivTeme = poljeTeme[var];
               if(listaTema.contains(nazivTeme)){
                   i--;
                   continue; // continue pokrece dalje for petlju ali sa korakom unazad jer je naziv teme isti, tako da bi ponovo randomao
               }
               else{
                   
               
                listaTema.add(nazivTeme);
               
               int brojKat= teme.get(i).brkat;
               //System.out.println("Za temu broj "+(i+1)+" naziva: "+nazivTeme +" ,korisnik smije prijavit "+brojKat+" kategorija");
               teme.get(i).odredivanjeKategorije(nazivTeme,brojKat,brNatjecatelja);
               
               
                bodovi+= teme.get(i).bodovi;
                
            
               
              // KlasaBodovanja bodovanje = new KlasaBodovanja(brTemaNat,nazivTeme,brojKat);
               }
            
               
        }
   
        
        
    }
    
    
}
