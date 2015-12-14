/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.dependencyInjection;
import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;
import org.foi.uzdiz.embalint.PodaciOblici;
/**
 *
 * @author Emil
 */
public class Mnogokuti implements Oblici{

    @Override
    public float izracunajPovrsinu(PodaciOblici objekt) {
        
       // System.out.println("mnogokut povrsina");
        float povrsina;
        povrsina = 0;
            
            for(int i = 0; i< objekt.getKoordinate().size();i+=2){
                
                povrsina+= Integer.parseInt(objekt.getKoordinate().get(i)) * 
                        (Integer.parseInt(objekt.getKoordinate().get((i+3)% objekt.getKoordinate().size())))
                        -(Integer.parseInt(objekt.getKoordinate().get((i+1)%objekt.getKoordinate().size())) * 
                        Integer.parseInt(objekt.getKoordinate().get((i+2)%objekt.getKoordinate().size())));

            }
            povrsina = Math.abs(povrsina);
            povrsina/=2;
            
            
       return povrsina;
    }
    
    
    
}
