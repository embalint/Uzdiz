/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.natjecanje;

import java.util.ArrayList;
import java.util.Random;
import org.foi.uzdiz.embalint.GlavnaKlasa;
import org.foi.uzdiz.embalint.fotoaparati.bezzrcalni.BezZrcalniAbstract;
import org.foi.uzdiz.embalint.fotoaparati.dslr.DslrAbstract;
import org.foi.uzdiz.embalint.fotoaparati.kompaktni.KompaktniAbstract;

/**
 *
 * @author Emil
 */
public class KlasaBodovanja {

    int brNatjecatelja;
    String nazivTeme;
    int brojKat;
    String nazivKategorije;
    Random randomGenerator = new Random();
    int bodovi;
    DslrAbstract dslrObjekt;
    KompaktniAbstract kompakt;
    BezZrcalniAbstract zrcalni;
    Pravilo1 pravilo = new Pravilo1();
    boolean diskvalificiran = false;

    KlasaBodovanja(int brNatjecatelja, String nazivTeme, int brojKat, String nazivKategorije, DslrAbstract dslrObjekt) {
        this.brNatjecatelja = brNatjecatelja;
        this.nazivTeme = nazivTeme;
        this.brojKat = brojKat;
        this.nazivKategorije = nazivKategorije;
        this.dslrObjekt = dslrObjekt;
        
        
        if (randomGenerator.nextInt(22) > 2) {
            if (GlavnaKlasa.pravilaBodovanja.equals("Pravilo1")){

                bodovi = pravilo.bodovanje();
                
            }
            else if (GlavnaKlasa.pravilaBodovanja.equals("Pravilo2")){
                bodovi = pravilo.bodovanje();
            }
            
            
        } else {
            diskvalificiran = true;
        }

    }

    KlasaBodovanja(int brNatjecatelja, String nazivTeme, int brojKat, String nazivKategorije, KompaktniAbstract kompakt) {
        this.brNatjecatelja = brNatjecatelja;
        this.nazivTeme = nazivTeme;
        this.brojKat = brojKat;
        this.nazivKategorije = nazivKategorije;
        this.kompakt = kompakt;
        
        if (randomGenerator.nextInt(22) > 2) {
            if (GlavnaKlasa.pravilaBodovanja.equals("Pravilo1")){
                 
                bodovi = pravilo.bodovanje();

            }
            else if (GlavnaKlasa.pravilaBodovanja.equals("Pravilo2")){
                bodovi = pravilo.bodovanje();
            }
            
            
        } else {
            diskvalificiran = true;
        }
    }

    KlasaBodovanja(int brNatjecatelja, String nazivTeme, int brojKat, String nazivKategorije, BezZrcalniAbstract zrcalni) {
        this.brNatjecatelja = brNatjecatelja;
        this.nazivTeme = nazivTeme;
        this.brojKat = brojKat;
        this.nazivKategorije = nazivKategorije;
        this.zrcalni = zrcalni;
        
        if (randomGenerator.nextInt(22) > 2) {
            
            if (GlavnaKlasa.pravilaBodovanja.equals("Pravilo1")){
                bodovi = pravilo.bodovanje();
        
            }
            else if (GlavnaKlasa.pravilaBodovanja.equals("Pravilo2")){
                bodovi = pravilo.bodovanje();
            }
            
            
        } else {
            diskvalificiran = true;
        }
        
    }

    public void bodovanjePrijave() {
     
    }

 

}
