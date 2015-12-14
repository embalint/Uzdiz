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
public class PrijestupKoordinata {
    
  public void prijestupKor(){
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
                                    System.out.println("Prestup po koordinati X i Y");
                                    pod.setPrestup("XY");
                                    pod.ispis();

                                }

                                else if(Integer.parseInt(pod.getKoordinate().get(0))+ 
                                Integer.parseInt(pod.getKoordinate().get(2))> listaPodataka.get(i).maxX()
                                        || Integer.parseInt(pod.getKoordinate().get(0))- 
                                Integer.parseInt(pod.getKoordinate().get(2))< 0){
                                    System.out.println("Prestup po koordinati X");
                                    pod.setPrestup("X");
                                    pod.ispis();

                                }
                                else if(Integer.parseInt(pod.getKoordinate().get(1)) +
                                        Integer.parseInt(pod.getKoordinate().get(2)) > listaPodataka.get(i).maxY()
                                        || Integer.parseInt(pod.getKoordinate().get(1))-
                                        Integer.parseInt(pod.getKoordinate().get(2)) < 0){
                                    System.out.println("Prestup po koordinati Y");
                                    pod.setPrestup("Y");
                                    pod.ispis();

                                }
                            }
                            // ako nije size == 3 onda je nesto drugo

                            else{
                                if(pod.maxX() > listaPodataka.get(i).maxX() && pod.maxY() > listaPodataka.get(i).maxY()){
                                System.out.println("Prestup po koordinati X i Y");                           
                                pod.setPrestup("XY");
                                pod.ispis();
                                }
                                else if (pod.maxX() > listaPodataka.get(i).maxX()){
                                    System.out.println("Prestup po koordinati X");                           
                                    pod.setPrestup("X");
                                    pod.ispis();
                                }
                                else if( pod.maxY() > listaPodataka.get(i).maxY()){
                                    System.out.println("Prestup po koordinati Y");                           
                                    pod.setPrestup("Y");
                                    pod.ispis();
                                }

                            }
                        }
                    }
                }
            }

   
  }
}
