/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.memento;

import java.io.IOException;
import java.util.Scanner;
import org.foi.uzdiz.embalint.GlavnaKlasa;
import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;
import org.foi.uzdiz.embalint.PodaciOblici;

/**
 *
 * @author Emil
 */
public class MementoPokretac {
    Scanner input = new Scanner(System.in);    
            int odabir;
            KlasaCaretaker caretaker = new KlasaCaretaker();
            KlasaOriginator originator = new KlasaOriginator();
            int spremiPodatke=0;
            int trenutnaDatoteka=0;
            String datoteka;
           
            
            public MementoPokretac(String datoteka){
                this.datoteka = datoteka;
            }
            public void mementoMenu() throws IOException{
                
              do{
                System.out.println("\nUpisite odgovarajuci broj za izbor\n"
                    + "\n1-Spremite trenutno stanje datoteke\n2-Vratite pocetno stanje datoteke"
                    + "\n3-Izadite u glavni menu"
                       );
                odabir = input.nextInt();
                System.out.println("");
                 
                switch(odabir){
                    case 1:
                        
                        originator.setNovaDat(datoteka);
                        caretaker.addMemento(originator.spremiUMemento());
                        spremiPodatke++;
                        trenutnaDatoteka++;
                        for(PodaciOblici s : listaPodataka){      
                            s.ispis();
                        }
                        break;
                        /// popraviti
                    case 2:
                        if(trenutnaDatoteka >= 1){
                            trenutnaDatoteka--;
                        originator.restoreFromMemento(caretaker.getMemento(trenutnaDatoteka));
                        for(PodaciOblici s : listaPodataka){      
                            s.ispis();
                        }      
                        }
                        else
                        {
                            System.out.println("Nema nista za vrratiti");
                        }
                        break;
                    case 3:
                        
                        String[] args = {datoteka};
                        GlavnaKlasa.main(args);
                        
                        break;
            
                    default: break;
      
                }
            }while(odabir!=0);
    
}}
