/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;

import java.util.ArrayList;
import java.util.Collections;
import javafx.print.Collation;

/**
 *
 * @author Emil
 */
public class PodaciOblici {
    
    private String tip;
    private String sifra;
    private String roditelj;
    private ArrayList<String> koordinate;
    private String boja;
    private Boolean status;
    private String prestup;
    private float povrsina;

    public float getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(float povrsina) {
        this.povrsina = povrsina;
    }
    
       public void setPrestup(String prestup) {
        this.prestup = prestup;
    }

    public String getPrestup() {
        return prestup;
    }

 

    
    public void ispis(){
        if(this.getStatus()){                 
            System.out.print(this.tip + "\t"+ this.sifra + "\t"+ this.roditelj + "\t"
            + this.koordinate + "\t" + this.boja + "\n");
        }
    }
    
    
    
    public void promjenaStatusa(String status, String sifra){
        if(this.getSifra().equals(sifra)){           
            if(status.equals("A")){
                this.setStatus(Boolean.TRUE);
                
            }
            else if(status.equals("S")){
                this.setStatus(Boolean.FALSE);
                
            }           
            else{
                System.out.println("Krivo unesen status");
            }
                                
        }
        
        
    }
    
    public int zbrojMinMax(){
        return Integer.parseInt(this.koordinate.get(this.koordinate.indexOf(Collections.max(koordinate))))
                + Integer.parseInt(this.koordinate.get(this.koordinate.indexOf(Collections.min(koordinate))));               
    }
    
    public int maxX(){
        int max = Integer.parseInt(this.koordinate.get(0));
        for(int i = 0; i< this.koordinate.size();i+=2){
            if(max < Integer.parseInt(this.koordinate.get(i))){
                max = Integer.parseInt(this.koordinate.get(i));
            }
        }
        return max;
    }
    
    public int minX(){
        int min = Integer.parseInt(this.koordinate.get(0));
        for(int i = 0; i< this.koordinate.size();i+=2){
            if(min > Integer.parseInt(this.koordinate.get(i))){
                min = Integer.parseInt(this.koordinate.get(i));
            }
        }
        return min;
    }
    
    public int maxY(){
        int max = Integer.parseInt(this.koordinate.get(1));
        for(int i = 1; i< this.koordinate.size();i+=2){
            if(max < Integer.parseInt(this.koordinate.get(i))){
                max = Integer.parseInt(this.koordinate.get(i));
            }
        }
        return max;
    }
    
    public int minY(){
        int min = Integer.parseInt(this.koordinate.get(1));
        for(int i = 1; i< this.koordinate.size();i+=2){
            if(min > Integer.parseInt(this.koordinate.get(i))){
                min = Integer.parseInt(this.koordinate.get(i));
            }
        }
        return min;
    }
    
    
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    } 
  
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getRoditelj() {
        return roditelj;
    }

    public void setRoditelj(String roditelj) {
        this.roditelj = roditelj;
    }

    public ArrayList<String> getKoordinate() {
        return koordinate;
    }

    public void setKoordinate(ArrayList<String> koordinate) {
        this.koordinate = koordinate;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

}