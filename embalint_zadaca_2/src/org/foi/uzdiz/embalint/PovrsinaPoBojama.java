/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;

import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;
import org.foi.uzdiz.embalint.dependencyInjection.Krug;
import org.foi.uzdiz.embalint.dependencyInjection.Mnogokuti;
import org.foi.uzdiz.embalint.dependencyInjection.Povrsina;
import org.foi.uzdiz.embalint.dependencyInjection.Pravokutnik;
import java.util.ArrayList;

/**
 *
 * @author Emil
 */
public class PovrsinaPoBojama {
     Krug krug = new Krug();
     Povrsina pov = new Povrsina();
     Mnogokuti mno = new Mnogokuti();
     Pravokutnik pravokutnik = new Pravokutnik();
     ArrayList<String> boje = new ArrayList<>();
    
    public void izracunajPPB(){
        PovrsinaPoBojama ppb = new PovrsinaPoBojama();
                        boje.add(listaPodataka.get(0).getBoja());
                        Boolean ista;
                        for(PodaciOblici pod : listaPodataka){
                            ista = false;
                            for(int i = 0; i< boje.size();i++){
                                if(pod.getBoja().equals(boje.get(i))){
                                    ista = true;
                                }
                            }
                            if(ista == false){
                                boje.add(pod.getBoja());
                            }
                        }
                        float ukupno;
                        for(String s : boje){
                            ukupno = 0;
                            System.out.println("Boja " +s );
                            for(PodaciOblici pod : listaPodataka){
                                if(s.equals(pod.getBoja())){
                                    if(pod.getStatus() == Boolean.TRUE && pod.getPrestup().isEmpty()){ 
                                        if(pod.getKoordinate().size() == 3){
                                            pov.setOblici(krug);
                                            pod.setPovrsina(pov.Povrsina(pod));
                                            ukupno+=pod.getPovrsina();
                                        }
                                        else if(pod.getKoordinate().size()== 4){
                                            pov.setOblici(pravokutnik);
                                            pod.setPovrsina(pov.Povrsina(pod));
                                            ukupno += pod.getPovrsina();
                                        }
                                        else{
                                            pov.setOblici(mno);
                                            pod.setPovrsina(pov.Povrsina(pod));
                                            ukupno += pod.getPovrsina();
                                        }
                                    }
                                }
                            }
                            System.out.println("ima povrsinu ukupno : "+ ukupno);
                        }
    }
    
}
