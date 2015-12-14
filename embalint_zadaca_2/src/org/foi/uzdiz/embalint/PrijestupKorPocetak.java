/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;

import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;

/**
 *
 * @author Emil
 */
public class PrijestupKorPocetak {
    
      public void prijestupKorPocetak(){
      for(PodaciOblici pod : listaPodataka){
                //i+= 2 jer prolazi po x koordinatama
                for(int i = 0; i< listaPodataka.size();i++){
                    
                    if(pod.getStatus()){
                    
                        if(pod.getRoditelj().equals(listaPodataka.get(i).getSifra())){
                            // size == 3 znaci da je krug
                            if(pod.getKoordinate().size() == 3){
                                if((Integer.parseInt(pod.getKoordinate().get(0))+ 
                                Integer.parseInt(pod.getKoordinate().get(2))> listaPodataka.get(i).maxX()
                                        || Integer.parseInt(pod.getKoordinate().get(0))- 
                                Integer.parseInt(pod.getKoordinate().get(2))< 0) && 
                                        (Integer.parseInt(pod.getKoordinate().get(1)) +
                                        Integer.parseInt(pod.getKoordinate().get(2)) > listaPodataka.get(i).maxY()
                                        || Integer.parseInt(pod.getKoordinate().get(1))-
                                        Integer.parseInt(pod.getKoordinate().get(2)) < 0)){
                                   
                                    pod.setPrestup("XY");
                                    

                                }

                                else if(Integer.parseInt(pod.getKoordinate().get(0))+ 
                                Integer.parseInt(pod.getKoordinate().get(2))> listaPodataka.get(i).maxX()
                                        || Integer.parseInt(pod.getKoordinate().get(0))- 
                                Integer.parseInt(pod.getKoordinate().get(2))< 0){
                                   
                                    pod.setPrestup("X");
                                  

                                }
                                else if(Integer.parseInt(pod.getKoordinate().get(1)) +
                                        Integer.parseInt(pod.getKoordinate().get(2)) > listaPodataka.get(i).maxY()
                                        || Integer.parseInt(pod.getKoordinate().get(1))-
                                        Integer.parseInt(pod.getKoordinate().get(2)) < 0){
                                  
                                    pod.setPrestup("Y");
                                   

                                }
                            }
                            // ako nije size == 3 onda je nesto drugo

                            else{
                                if(pod.maxX() > listaPodataka.get(i).maxX() && pod.maxY() > listaPodataka.get(i).maxY()){
                                               
                                pod.setPrestup("XY");
                        
                                }
                                else if (pod.maxX() > listaPodataka.get(i).maxX()){
                                                          
                                    pod.setPrestup("X");
                            
                                }
                                else if( pod.maxY() > listaPodataka.get(i).maxY()){
                                                          
                                    pod.setPrestup("Y");
                          
                                }

                            }
                        }
                    }
                }
            }

   
  }
    
}
