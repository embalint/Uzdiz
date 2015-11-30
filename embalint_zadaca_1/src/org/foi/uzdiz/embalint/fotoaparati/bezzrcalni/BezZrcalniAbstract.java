/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.fotoaparati.bezzrcalni;



/**
 *
 * @author Emil
 */
public abstract class BezZrcalniAbstract {
     String naziv = null;
    String objektiv = null;
    String faktorPovecanja;
    boolean dodatnRukohvat;
    int otvorBlende ;
    int vrijemeEkspozicije;

    public int getOtvorBlende() {
        return otvorBlende;
    }

    public void setOtvorBlende(int otvorBlende) {
        this.otvorBlende = otvorBlende;
    }

    public int getVrijemeEkspozicije() {
        return vrijemeEkspozicije;
    }

    public void setVrijemeEkspozicije(int vrijemeEkspozicije) {
        this.vrijemeEkspozicije = vrijemeEkspozicije;
    }
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(String objektiv) {
        this.objektiv = objektiv;
    }

    public String getFaktorPovecanja() {
        return faktorPovecanja;
    }

    public void setFaktorPovecanja(String faktorPovecanja) {
        this.faktorPovecanja = faktorPovecanja;
    }

    public boolean isDodatnRukohvat() {
        return dodatnRukohvat;
    }

    public void setDodatnRukohvat(boolean dodatnRukohvat) {
        this.dodatnRukohvat = dodatnRukohvat;
    }
     public void prikaziNaziv(){
            System.out.println(getNaziv());
    }
    
    
   
}
