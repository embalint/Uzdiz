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
public class ProvjeraIspravnosti {
    
    public void provjeriIspravnost(){
        Boolean preskok = false;
        for(int i = 0; i< listaPodataka.size();i++){
            if(preskok == true){
                i--;
            }
            preskok = false;
            
                for(int j = i+1; j< listaPodataka.size();j++){                   
                    if(listaPodataka.get(i).getSifra().equals(listaPodataka.get(j).getSifra())){
                        System.out.println("Element ima istu sifru kao vec postojeci element");
                        listaPodataka.get(j).ispis();
                        listaPodataka.remove(j);
                        j--;
                        
                    }
                }
                if(listaPodataka.get(i).getKoordinate().size()>14 ){
                    System.out.println("Element ima previse koordinata");
                    listaPodataka.get(i).ispis();
                    listaPodataka.remove(i);
                  
                    preskok = true;
                }
                else if(listaPodataka.get(i).getKoordinate().size() < 3){
                    System.out.println("Element ima premali broj koordinata");
                    listaPodataka.get(i).ispis();
                    listaPodataka.remove(i);
                 
                    preskok = true;
                }
                else if(listaPodataka.get(i).getKoordinate().size() %2 == 1 && listaPodataka.get(i).getKoordinate().size()>3){
                    System.out.println("Element nema jednu y koordinatu");
                    listaPodataka.get(i).ispis();
                    listaPodataka.remove(i);
                 
                    preskok = true;
                }
                
                
                
                if(i == 0){              
                    continue;
                }
                if(listaPodataka.get(i).getSifra().equals(listaPodataka.get(i).getRoditelj())){
                    System.out.println("Element je sam sebi roditelj a nije ishodni element");
                    listaPodataka.get(i).ispis();
                    listaPodataka.remove(i);
                 
                    preskok = true;
                    
                }
                
                if(listaPodataka.get(i).getKoordinate().size() == 4 &&
                        (listaPodataka.get(i).getKoordinate().get(0).equals(listaPodataka.get(i).getKoordinate().get(2))
                        || listaPodataka.get(i).getKoordinate().get(1).equals(listaPodataka.get(i).getKoordinate().get(3)))){
                    System.out.println("Element je duzina");
                    listaPodataka.get(i).ispis();
                    listaPodataka.remove(i);
                   
                    preskok = true;
                }
                
                
                
                
            }
        
              
        for(int i = listaPodataka.size()-1 ; i>= 0; i--){
            if(preskok == true){
                i--;
            }
            preskok = false;
            
            for(int j = listaPodataka.size()-1; j>=0;j--){
                if(listaPodataka.get(i).getTip().equals("1")){
                    if(listaPodataka.get(i).getRoditelj().equals(listaPodataka.get(j).getSifra())){
                        if(listaPodataka.get(j).getTip().equals("1")){
                            System.out.println("Jednostavni element koji nije sadrzan u slozenom elementu");
                            listaPodataka.get(i).ispis();
                            listaPodataka.remove(i);
                            
                            j--;
                            preskok = true;
                        }
                    }
                }
            }
            
        }
        for(int i = 0 ; i< listaPodataka.size();i++){
            if(preskok == true){
                i--;
            }
            preskok = false;
            if(listaPodataka.get(i).getTip().equals("0")){
                if(listaPodataka.get(i).getKoordinate().size() != 4){
                    if(listaPodataka.get(i).getKoordinate().size() !=8){
                        System.out.println("Element je slozeni, ali nije pravokutnik");
                        listaPodataka.get(i).ispis();
                        listaPodataka.remove(i);
                        
                        preskok = true;
                    }
                    else if(listaPodataka.get(i).getKoordinate().get(0) != listaPodataka.get(i).getKoordinate().get(6)
                        ||  listaPodataka.get(i).getKoordinate().get(1) != listaPodataka.get(i).getKoordinate().get(7)  
                        ||  listaPodataka.get(i).getKoordinate().get(2) != listaPodataka.get(i).getKoordinate().get(4)
                        ||  listaPodataka.get(i).getKoordinate().get(3) != listaPodataka.get(i).getKoordinate().get(5)){
                        System.out.println("Element je slozeni, ali nije pravokutnik");
                        listaPodataka.get(i).ispis();
                        listaPodataka.remove(i);
                        
                        preskok = true;
                    }
                }
            }
        }
        
        
        
        
        for(int i = 0; i< listaPodataka.size();i++){
        
            preskok = false;
            for(int j = 0 ; j<listaPodataka.size(); j++){
                if(listaPodataka.get(i).getRoditelj().equals(listaPodataka.get(j).getSifra())){
                    preskok = true;
                }
            }
            if(preskok == false){
                System.out.println("Element ciji roditelj ne postoji");
                listaPodataka.get(i).ispis();
                listaPodataka.remove(i);
                i--;
            }
        }
    }
    
}
