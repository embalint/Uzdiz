/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.natjecanje;

import java.util.Random;

import org.foi.uzdiz.embalint.fotoaparati.bezzrcalni.BezZrcalniAbstract;

import org.foi.uzdiz.embalint.fotoaparati.bezzrcalni.BezZrcalniFactory;

import org.foi.uzdiz.embalint.fotoaparati.dslr.DslrAbstract;
import org.foi.uzdiz.embalint.fotoaparati.dslr.DslrFactory;
import org.foi.uzdiz.embalint.fotoaparati.kompaktni.KompaktniAbstract;
import org.foi.uzdiz.embalint.fotoaparati.kompaktni.KompaktniFactory;


/**
 *
 * @author Emil
 */
public class KategorijaFactory {
    int vrstaKategorije=0;
    String nazivKategorije;
    int bodovi;
    KlasaBodovanja bodovanje;
    DslrAbstract dslrObjekt;
    KategorijaFactory(String nazivTeme,int brojKat,int brNatjecatelja,Integer vrste) {
        this.vrstaKategorije= vrste; // ove vrste inace sadrze brojeve kategroija a ne pojedinih fotica pa to treba prepraviti
        Random randomGenerator = new Random();
        int brojFotica=0;
         if (vrste== 1) {
                //System.out.println("Kategorija naziv DSLR");
                nazivKategorije="DSLR";
                brojFotica= randomGenerator.nextInt(3)+1; // koji od 3 fotica iz te kategorije ce bit dodjeljen 
                DslrFactory factory = new DslrFactory();
                dslrObjekt = factory.izvadiDslrFactory(brojFotica);
                
               // GlavnaKlasa.izradiDslr(dslrObjekt);//ispisujem u glavnoj klasi
                bodovanje = new KlasaBodovanja(brNatjecatelja,nazivTeme,brojKat,nazivKategorije,dslrObjekt);
                
               //bodovanje.bodovanjePrijave();
               
                
        } else if (vrste == 2) {
           //System.out.println("Kategorija naziv Kompaktni");
            nazivKategorije="Kompaktni";
            brojFotica= randomGenerator.nextInt(3)+1;
             KompaktniFactory factory = new KompaktniFactory();
             KompaktniAbstract kompakt = factory.izvadiKompaktniFactory(brojFotica);
             //kompakt.prikaziNaziv();
             //GlavnaKlasa.izradiKompaktni(kompakt);
             
              bodovanje = new KlasaBodovanja(brNatjecatelja,nazivTeme,brojKat,nazivKategorije,kompakt);
             //bodovanje.bodovanjePrijave();
           
        } else if (vrste == 3) {
            //System.out.println("Kategorija naziv BezZrcalni");
            nazivKategorije= "BezZRcalni";
            brojFotica= randomGenerator.nextInt(3)+1;
             BezZrcalniFactory factory = new BezZrcalniFactory();
             
             BezZrcalniAbstract zrcalni = factory.izvadiKompaktniFactory(brojFotica);
             //zrcalni.prikaziNaziv(); // zadnji dio u programu- gotova prijava je tu
             //GlavnaKlasa.izradiBezZrcala(zrcalni);
             bodovanje = new KlasaBodovanja(brNatjecatelja,nazivTeme,brojKat,nazivKategorije,zrcalni);
            //bodovanje.bodovanjePrijave();
        } 
       
        
    }

   
   
    
}
