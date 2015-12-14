/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;

import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;
import java.util.Scanner;

/**
 *
 * @author Emil
 */
public class PromjenaStatusa {
    Scanner input = new Scanner(System.in);    
    public void promjeniStatus(){
              String sifra;
                        Boolean pronaden;
                        System.out.println("Upisite sifru elementa kojem zelite promjeniti status");
                        sifra = input.next();
                        pronaden = true;
                        for(PodaciOblici s : listaPodataka){
                            if(s.getSifra().equals(sifra)){
                                pronaden = false;
                            }
                        }
                        if(pronaden == true){
                            System.out.println("Nepostojeca sifra");
                            return;
                        }
                        System.out.println("Upisite status koji zelite postaviti (A-aktivan, S-sakriven)");
                        String status = input.next();
                        if(status.equals("S")){
                            System.out.println("Element i njegovi jednostavni elementi su sakriveni");
                        }
                        else if(status.equals("A")){
                            System.out.println("Element i njegovi jednostavni elementi su aktivni");
                        }
                        for(PodaciOblici s : listaPodataka){
                            s.promjenaStatusa(status, sifra);  
                            if(s.getRoditelj().equals(sifra)){
                                s.promjenaStatusa(status, s.getSifra());
                                
                                
                            }
                        } 
                        
                        for(PodaciOblici s: listaPodataka){
                            for(PodaciOblici pod : listaPodataka){
                                if(s.getRoditelj().equals(pod.getSifra())){
                                    s.setStatus(pod.getStatus());
                                    
                                }
                            }
                        }
                        for(PodaciOblici s: listaPodataka){
                            for(PodaciOblici pod : listaPodataka){
                                if(s.getRoditelj().equals(pod.getSifra())){
                                    s.setStatus(pod.getStatus());
                                    
                                }
                            }
                        }
                        for(PodaciOblici s : listaPodataka){
                            s.promjenaStatusa(status, sifra);  
                            if(s.getRoditelj().equals(sifra)){
                                s.promjenaStatusa(status, s.getSifra());
                                
                                
                            }
                        } 
                        
                        
    }
    
}
