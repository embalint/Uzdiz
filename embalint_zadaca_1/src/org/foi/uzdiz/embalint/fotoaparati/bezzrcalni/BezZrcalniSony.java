/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.fotoaparati.bezzrcalni;

import java.util.Random;
import org.foi.uzdiz.embalint.fotoaparati.kompaktni.*;
import org.foi.uzdiz.embalint.natjecanje.Fotografija;

/**
 *
 * @author Emil
 */
public class BezZrcalniSony extends BezZrcalniAbstract{
    public BezZrcalniSony(){
        setNaziv("Sony"); 
        setObjektiv("");
        setFaktorPovecanja("");
        setDodatnRukohvat(true);
        Fotografija foto = new Fotografija();
        Random randomGenerator = new Random();
        foto.setOtvorBlende(randomGenerator.nextInt(22));// blende se krecu do 22
        foto.setVrijemeEkspozicije(randomGenerator.nextInt(3)); //0 lose, 1 idealno 2 preekponzivno
        // System.out.println("Fotografija ima otvor blende: "+ foto.getOtvorBlende()+" i vrijeme ekspozicije "+ foto.getVrijemeEkspozicije());
        setOtvorBlende(foto.getOtvorBlende());
        setVrijemeEkspozicije(foto.getVrijemeEkspozicije());
    }
    
}
