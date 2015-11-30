/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.fotoaparati.dslr;

/**
 *
 * @author Emil
 */
public abstract class DslrAbstract {
    
    String naziv = null;
    String objektiv = null;
    String faktorPovecanja = null;
    boolean intRukohvat;
    boolean blic;
    String stablilizator;
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

    public boolean isIntRukohvat() {
        return intRukohvat;
    }

    public void setIntRukohvat(boolean intRukohvat) {
        this.intRukohvat = intRukohvat;
    }

    public boolean isBlic() {
        return blic;
    }

    public void setBlic(boolean blic) {
        this.blic = blic;
    }

    public String getStablilizator() {
        return stablilizator;
    }

    public void setStablilizator(String stablilizator) {
        this.stablilizator = stablilizator;
    }
    
    public void prikaziNaziv(){
            System.out.println(getNaziv());
    }
    
    
    
}
