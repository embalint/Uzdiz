/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.natjecanje;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.foi.uzdiz.embalint.GlavnaKlasa;

/**
 *
 * @author Emil
 */
public class NatjecanjeSingleton {
    ArrayList<Natjecatelj> lista_natjecatelja = new ArrayList<>();
    int bodovi_pobjednika = 0;
     private static NatjecanjeSingleton firstInstance = null;

    public static NatjecanjeSingleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new NatjecanjeSingleton();
        }
        return firstInstance;
    }
    
    int broj_tema;
    int broj_kategorija;
    int broj_natjecatelja;
    
    
    public void Natjecanje(int broj_tema, int broj_kategorija, int broj_natjecatelja) throws UnsupportedEncodingException, FileNotFoundException, IOException{
        this.broj_kategorija = broj_kategorija;
        this.broj_natjecatelja = broj_natjecatelja;
        this.broj_tema = broj_tema;
      
        UpisUDatoteku upis = new UpisUDatoteku(GlavnaKlasa.datoteka);
        for(int i = 0;i<broj_natjecatelja;i++)
        {
            //System.out.println("--------------------------");
            //System.out.println("natjecatelj broj: "+ (i+1));
            int brojNatjecatelja = (i+1);
            Natjecatelj natjecatelj = new Natjecatelj();
            natjecatelj.prijava(broj_tema, broj_kategorija,brojNatjecatelja);
            lista_natjecatelja.add(natjecatelj);
           // KlasaBodovanja bodovanje = new KlasaBodovanja((i+1));
            if(lista_natjecatelja.get(i).bodovi > bodovi_pobjednika){
                bodovi_pobjednika = lista_natjecatelja.get(i).bodovi;
            }
        }
        Natjecatelj pom;
        for(int i = 0; i < lista_natjecatelja.size()-1;i++){
            for(int j = i+1; j< lista_natjecatelja.size();j++){
                if(lista_natjecatelja.get(i).bodovi< lista_natjecatelja.get(j).bodovi){
                    pom = lista_natjecatelja.get(i);
                    lista_natjecatelja.set(i, lista_natjecatelja.get(j));
                    lista_natjecatelja.set(j, pom);                
                }
            }
        }
        int broj = 3;
        if(broj_natjecatelja<3){
            broj = broj_natjecatelja;
        }
        for(int i = 0 ; i< broj;i++){
            System.out.println((i+1)+". mjesto, natjecatelj sa "+ lista_natjecatelja.get(i).bodovi);
        }
        System.out.println("Bodovi pobjednika su: "+ bodovi_pobjednika);
        
        UpisUDatoteku.upisi("broj tema na natjecanju "+broj_tema+"\n"
                + "max broj kategorija na natjecanju "+broj_kategorija+"\n"
        +"Broj natjecatelja "+broj_natjecatelja+"\n"
                +"Pocetak prijava ------------------");
        
        
        
        
        for(int i = 0 ; i < lista_natjecatelja.size();i++){
            UpisUDatoteku.upisi("\nNatjecatelj broj: "+(i+1)+"\n"
                                   +"Broj tema:"+ lista_natjecatelja.get(i).teme.size());
            for(int j = 0; j< lista_natjecatelja.get(i).teme.size();j++){
                UpisUDatoteku.upisi("\nTema broj "+(j+1)+" je "+lista_natjecatelja.get(i).teme.get(j).nazivTeme
                                    + "\nBroj kategorija unutar teme je "+lista_natjecatelja.get(i).teme.get(j).lista_kategorija.size()
                );
                for(int k = 0;k <lista_natjecatelja.get(i).teme.get(j).lista_kategorija.size();k++){
                    UpisUDatoteku.upisi("Kategorija broj "+(k+1) + " je "
                            +lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).nazivKategorije+"\n"
                             /*+" te mu pripada fotoaparat "+ lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).dslrObjekt.getNaziv()+
                             " i slika " + lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).dslrObjekt.getOtvorBlende()   */
                    );
                    if(lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).bodovanje.diskvalificiran){
                        UpisUDatoteku.upisi("Natjecatelj je diskvalificiran u toj kategoriji");
                    }
                    else{
                        for(int z = 0 ; z <lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).bodovanje.pravilo.suci.size();z++){
                            UpisUDatoteku.upisi("Sudac broj "+(z+1)+ " ocjenjuje sa "+
                                 lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).bodovanje.pravilo.suci.get(z)+
                                    " bodova");
                        }
                    }
                    UpisUDatoteku.upisi("Ukupan broj bodova u kategoriji iznosi: "+
                            lista_natjecatelja.get(i).teme.get(j).lista_kategorija.get(k).bodovanje.bodovi);
                    
                }
                UpisUDatoteku.upisi("\nUkupan broj bodova u temi iznosi: "+lista_natjecatelja.get(i).teme.get(j).bodovi);
            }
            UpisUDatoteku.upisi("\nUkupan broj bodova natjecatelja iznosi: "+ lista_natjecatelja.get(i).bodovi);
        }
        UpisUDatoteku.upisi("\nKonacna lista natjecatelja");
        for(int i= 0 ; i< lista_natjecatelja.size();i++){
            UpisUDatoteku.upisi((i+1)+". mjesto: Natjecatelj sa "+lista_natjecatelja.get(i).bodovi+ " bodova");
        }
        
        
        UpisUDatoteku.zatvoriDatoteku();
        
    }
    
    
    
}
