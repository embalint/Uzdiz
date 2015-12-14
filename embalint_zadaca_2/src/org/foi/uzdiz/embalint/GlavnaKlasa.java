/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;



import org.foi.uzdiz.embalint.singleton.ReaderDatoteke;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import org.foi.uzdiz.embalint.memento.MementoPokretac;

/**
 *
 * @author Emil
 */
public class GlavnaKlasa {
    public static ArrayList<PodaciOblici> listaPodataka = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
 
        Charset encoding = Charset.defaultCharset();
           // ArrayList<String> roditelji = new ArrayList<>();
            
            String datoteka = args[0]; 
            
            File file = new File(datoteka);
            
            // readerDatoteke je singleton 
            ReaderDatoteke re  = ReaderDatoteke.getInstance();;
            if(file.isFile() && !file.isDirectory()){
                
                re.handleFile(file, encoding);
            }
            
           
            ProvjeraIspravnosti prov = new ProvjeraIspravnosti();
            prov.provjeriIspravnost();
            PrijestupKorPocetak pri = new PrijestupKorPocetak();
            pri.prijestupKorPocetak();

            Scanner input = new Scanner(System.in);    
            int odabir;
    
            do{
                System.out.println("\nUpisite odgovarajuci broj za izbor\n"
                    + "\n1-pregled stanja\n2-pregled jednostavnih elemenata s presjekom"
                        + " \n3-promjena statusa elementa\n4-ukupne povrsine boja"
                        + "\n5-učitavanje dodatne datoteke\n6- Vlastita funkcionalnost"
                        + "\n0-izlaz iz programa");
                odabir = input.nextInt();
                System.out.println("");
                switch(odabir){
                    case 1:
                        
                        for(PodaciOblici s : listaPodataka){      
                                s.ispis();
                            
                        }
                        System.out.println("");
                        System.out.println("Od navedenih elemenata prijestup imaju : ");
                        PrijestupKoordinata prijestup= new PrijestupKoordinata();
                        prijestup.prijestupKor();
                        System.out.println("");
                        break;
                        /// popraviti
                    case 2:
                        
                        ProvjeraPresjeka pres = new ProvjeraPresjeka();
                        pres.provjeriPresjek();
                    
                        break;
                    case 3: 
                        
                        PromjenaStatusa promj = new PromjenaStatusa();
                        promj.promjeniStatus();
                        
                        
                                
                        break;
                        
                    case 4:
                        PovrsinaPoBojama ppb = new PovrsinaPoBojama();
                        ppb.izracunajPPB();
                     
                        break;
                    case 5:
                        String imeDatoteke = input.next();
                        File file2 = new File(imeDatoteke);
                        if(file2.isFile() && ! file2.isDirectory()){
                            
                            re.handleFile(file2, encoding);
                        
                        prov.provjeriIspravnost();
                        }
                        else{
                            System.out.println("Krivo uneseno ime datoteke");
                        }
                        break;
                    case 6:
                        
                        
                        MementoPokretac pokr = new MementoPokretac(datoteka);
                        pokr.mementoMenu();
                        
                        break;
                    default: break;
      
                }
            }while(odabir!=0);
  
       // }
        
    }
    
}
