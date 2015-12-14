/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint.singleton;


import static org.foi.uzdiz.embalint.GlavnaKlasa.listaPodataka;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.foi.uzdiz.embalint.PodaciOblici;

/**
 *
 * @author Emil
 */
public class ReaderDatoteke {
    private static ReaderDatoteke firstInstance = null;
    
    
    public static ReaderDatoteke getInstance() {
        if (firstInstance == null) {
            firstInstance = new ReaderDatoteke();
        }
        return firstInstance;
    }
    
            
        public void handleFile(File file, Charset encoding)
            throws IOException {
        try (InputStream in = new FileInputStream(file);
             java.io.Reader reader = new InputStreamReader(in, encoding);
             // buffer for efficiency
             java.io.Reader buffer = new BufferedReader(reader)) {
             handleCharacters(buffer);
        }
    }

    private static void handleCharacters(java.io.Reader reader)
            throws IOException {
        int r;
        int counter = listaPodataka.size();
        String pomocna;
        while ((r = reader.read()) != -1) {
            while(r!='\n'){
                pomocna = "";
                char ch = (char)r;
                pomocna+= ch;
              
                listaPodataka.add(new PodaciOblici());
                listaPodataka.get(counter).setTip((pomocna));
                reader.read();
                pomocna= "";
                for(int i = 0 ; i<5;i++){
                    r = reader.read();
                    ch = (char)r;
                    pomocna+=ch;
                    
                    //System.out.println(pomocna);
                }
                listaPodataka.get(counter).setSifra((pomocna));
                //System.out.println(listaPodataka.get(counter).getTip());
                //System.out.println(listaPodataka.get(counter).getSifra());
                reader.read();
                pomocna= "";
                for(int i = 0;i< 5; i++){
                    r = reader.read();
                    ch = (char)r;
                    pomocna+=ch;                    
                }
                listaPodataka.get(counter).setRoditelj(pomocna);
                //System.out.println(listaPodataka.get(counter).getRoditelj());
                reader.read();
                pomocna = "";
                ArrayList<String> koordinate = new ArrayList<>();
                while(true){
                    r = reader.read();
                    ch = (char)r;
                    // 9 JE ASCII ZA RAZMAK
                    if(r == 9){
                        koordinate.add(pomocna);
                        break;
                    }
                    else{
                        if(ch == ','){
                            koordinate.add(pomocna);
                            pomocna="";
                        }
                        else{
                            pomocna+=ch;
                        }
                    }
                }
                listaPodataka.get(counter).setKoordinate(koordinate);
                for(String s :listaPodataka.get(counter).getKoordinate()){
                    //System.out.println(s);
                }
           
                pomocna = "";
                while((r = reader.read()) != '\n'){
                    
                    ch = (char)r;
                    pomocna+=ch;
                    
                }
                listaPodataka.get(counter).setBoja(pomocna);
                listaPodataka.get(counter).setStatus(Boolean.TRUE);
                listaPodataka.get(counter).setPrestup("");
                //System.out.println(listaPodataka.get(counter).getBoja());
                             
            }
            //povecavam objekt u listi za jedan, jer je redak 1 objekt u listi
            counter++;
            
        }
       
    }
    
}
