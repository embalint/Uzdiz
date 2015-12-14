/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;

import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;
import java.util.ArrayList;

/**
 *
 * @author Emil
 */
public class ProvjeraPresjeka {
    ArrayList<String> roditelji = new ArrayList<>();
    public void provjeriPresjek(){
        Boolean ista;
                        for(PodaciOblici pod : listaPodataka){
                            ista = false;
                            for(int i = 0; i< roditelji.size();i++){
                                if(pod.getRoditelj().equals(roditelji.get(i))){
                                    ista = true;
                                }
                            }
                            if(ista == false){
                                roditelji.add(pod.getRoditelj());
                                
                               
                                  
                            }
                        }
                        ArrayList<ArrayList<String>> listaRoditelja = new ArrayList<>();
                        for(int i = 0 ;  i< roditelji.size();i++){
                            listaRoditelja.add(new ArrayList<>());
                            listaRoditelja.get(i).add(roditelji.get(i));
                        }
                        
                       
                
                        
                        Boolean tocno;
                        for(int i = 1;i<listaPodataka.size();i++){
                            tocno = false;
                                for(int j = i+1;j<listaPodataka.size();j++){
                                    if(listaPodataka.get(i).getRoditelj().equals(listaPodataka.get(j).getRoditelj()) 
                                            && listaPodataka.get(i).getStatus() && listaPodataka.get(j).getStatus()){
                                       for(int k = 0;k<listaPodataka.get(i).getKoordinate().size();k+=2){
                            
                                           if(listaPodataka.get(i).getKoordinate().size() == 3 &&
                                                   listaPodataka.get(j).getKoordinate().size() == 3){
                                               
                                               if(Math.sqrt(Math.pow(Double.parseDouble(listaPodataka.get(j).getKoordinate().get(0))
                                               -Double.parseDouble(listaPodataka.get(i).getKoordinate().get(0)),2)+
                                                       Math.pow(Double.parseDouble(listaPodataka.get(j).getKoordinate().get(1))
                                                               -Double.parseDouble(listaPodataka.get(i).getKoordinate().get(1)), 2))
                                                       < 
                                                       Double.parseDouble(listaPodataka.get(i).getKoordinate().get(2) + 
                                                               Double.parseDouble(listaPodataka.get(j).getKoordinate().get(2))
                                                       )){
                                                   if(tocno == false){
                                            //       System.out.println("sifra roditelja: "+listaPodataka.get(i).getRoditelj());
                                           //        System.out.println("parovi sifra djece:");
                                                   tocno = true;
                                               }
                                                   for(ArrayList<String> arr : listaRoditelja){
                        
                                                        if(listaPodataka.get(i).getRoditelj().equals(arr.get(0))){
                                                            arr.add(listaPodataka.get(i).getSifra());
                                                            arr.add(listaPodataka.get(j).getSifra());
                                                        //    System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                                       }
                                                       
                                                   }
                                             //      System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                               break;
                                               }
                                               
                                           }
                                           else if(listaPodataka.get(i).getKoordinate().size() == 3){
                                               if(Math.sqrt(Math.pow(Double.parseDouble(listaPodataka.get(j).getKoordinate().get(k))
                                               -Double.parseDouble(listaPodataka.get(i).getKoordinate().get(0)),2)+
                                                       Math.pow(Double.parseDouble(listaPodataka.get(j).getKoordinate().get((k+1)% listaPodataka.get(j).getKoordinate().size()))
                                                               -Double.parseDouble(listaPodataka.get(i).getKoordinate().get(1)), 2))
                                                       <= 
                                                       Double.parseDouble(listaPodataka.get(i).getKoordinate().get(2)
                                                       )){
                                                   if(tocno == false){
                                              //     System.out.println("sifra roditelja: "+listaPodataka.get(i).getRoditelj());
                                               //    System.out.println("parovi sifra djece:");
                                                   tocno = true;
                                               }
                                                   for(ArrayList<String> arr : listaRoditelja){
                        
                                                        if(listaPodataka.get(i).getRoditelj().equals(arr.get(0))){
                                                            arr.add(listaPodataka.get(i).getSifra());
                                                            arr.add(listaPodataka.get(j).getSifra());
                                                        //    System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                                       }
                                                       
                                                   }
                                           //    System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                               break;
                                               }
                                           }
                                           else if(listaPodataka.get(j).getKoordinate().size() == 3){
                                               if(Math.sqrt(Math.pow(Double.parseDouble(listaPodataka.get(i).getKoordinate().get(k))
                                               -Double.parseDouble(listaPodataka.get(j).getKoordinate().get(0)),2)+
                                                       Math.pow(Double.parseDouble(listaPodataka.get(i).getKoordinate().get((k+1)% listaPodataka.get(i).getKoordinate().size()))
                                                               -Double.parseDouble(listaPodataka.get(j).getKoordinate().get(1)), 2))
                                                       <= 
                                                       Double.parseDouble(listaPodataka.get(j).getKoordinate().get(2)
                                                       )){
                                                   if(tocno == false){
                                                 //  System.out.println("sifra roditelja: "+listaPodataka.get(i).getRoditelj());
                                              //     System.out.println("parovi sifra djece:");
                                                   tocno = true;
                                               }
                                                   for(ArrayList<String> arr : listaRoditelja){
                        
                                                        if(listaPodataka.get(i).getRoditelj().equals(arr.get(0))){
                                                            arr.add(listaPodataka.get(i).getSifra());
                                                            arr.add(listaPodataka.get(j).getSifra());
                                                            
                                                          //  System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                                       }
                                                       
                                                   }
                                              // System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                               break;
                                               }
                                           }
                                           
                                           
                                           else{
                                       
                                               
                                            if(Integer.parseInt(listaPodataka.get(i).getKoordinate().get(k)) >= 
                                                    listaPodataka.get(j).minX() && Integer.parseInt(listaPodataka.get(i).getKoordinate().get(k))
                                                    <= listaPodataka.get(j).maxX() && 
                                                    Integer.parseInt(listaPodataka.get(i).getKoordinate().get((k+1)% listaPodataka.get(i).getKoordinate().size()))
                                                    >=listaPodataka.get(j).minY() &&
                                                    Integer.parseInt(listaPodataka.get(i).getKoordinate().get((k+1)% listaPodataka.get(i).getKoordinate().size()))
                                                    <= listaPodataka.get(j).maxY()){

                                                if(tocno == false){
                                               //     System.out.println("sifra roditelja: "+listaPodataka.get(i).getRoditelj());
                                                 //   System.out.println("parovi sifra djece:");
                                                    tocno = true;
                                                }
                                                for(ArrayList<String> arr : listaRoditelja){
                        
                                                        if(listaPodataka.get(i).getRoditelj().equals(arr.get(0))){
                                                            arr.add(listaPodataka.get(i).getSifra());
                                                            arr.add(listaPodataka.get(j).getSifra());
                                                          //  System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());
                                                       }
                                                       
                                                   }
                                                //System.out.println(listaPodataka.get(i).getSifra()+ " "+listaPodataka.get(j).getSifra());

                                            }
                                        }
                                       }

                                    }
                                }
                        }
                        Boolean preskok= false;
                        for(ArrayList<String> arr : listaRoditelja){
                            for(int i = 1 ; i< arr.size(); i+=2){
                                for(int j = i+2 ; j< arr.size();j+=2){
                                    if(preskok == true){
                                        j-=2;
                                    }
                                    preskok = false;
                                    if(arr.get(i).equals(arr.get(j)) && 
                                            arr.get((i+1)%arr.size()).equals(arr.get((j+1)% arr.size()))){
                                       // System.out.println(arr.get(i)+" " + arr.get((i+1)%arr.size()));
                                       // System.out.println(arr.get(j)+" " + arr.get((j+1)%arr.size()));
                                        arr.remove(j);
                                        arr.remove(j);
                                        preskok = true;
                                        
                                        
                                    }
                                }
                            }
                        }
                        
                        for(ArrayList<String> arr : listaRoditelja){
                            System.out.println("----------------------------------------------------");
                            System.out.println("sifra roditelja je " + arr.get(0));
                            System.out.println("Sifre parova jednostavnih elemenata s presjekom su:");
                            
                            if(arr.size() == 1){
                                System.out.println("ne postoje jednostavni elementi s presjekom");
                            }
                            for(int i = 1 ; i< arr.size();i+=2){
                                System.out.println("Element sa sifrom "+arr.get((i)% arr.size()) + " se sjeće sa elementom šifre " + arr.get((i+1)% arr.size()));
                            }
                        }
                        /*
                        for(ArrayList<String> arr : listaRoditelja){
                            for(int i = 0;i< arr.size();i++){
                                
                            }
                        }*/
                        
    }
}
