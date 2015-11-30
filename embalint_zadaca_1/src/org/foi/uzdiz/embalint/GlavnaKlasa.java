/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foi.uzdiz.embalint;

import java.io.IOException;
import java.util.Random;
import org.foi.uzdiz.embalint.fotoaparati.bezzrcalni.BezZrcalniAbstract;
import org.foi.uzdiz.embalint.natjecanje.KategorijaFactory;
import org.foi.uzdiz.embalint.natjecanje.NatjecanjeSingleton;
import org.foi.uzdiz.embalint.natjecanje.Natjecatelj;
import org.foi.uzdiz.embalint.fotoaparati.dslr.DslrFactory;
import org.foi.uzdiz.embalint.fotoaparati.dslr.DslrAbstract;
import org.foi.uzdiz.embalint.fotoaparati.kompaktni.KompaktniAbstract;

/**
 *
 * @author Emil
 */
public class GlavnaKlasa {
    public static String pravilaBodovanja;
    public static int brojZiria;
    public static String datoteka;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        long randBroj = 0;
        int maxBrTema = Integer.parseInt(args[1]);
        int brTemaNatjecatelj = Integer.parseInt(args[2]);
        int kategorijeNatjecatelj = Integer.parseInt(args[3]);
        int brojMaxNatjecatelja = Integer.parseInt(args[4]);
        brojZiria = Integer.parseInt(args[5]);
        pravilaBodovanja = args[6];
        datoteka = args[7];
        Random randomGenerator = new Random();
        int brojTema;
        int brojKategorija = 0;
        int brojNatjecatelja;
        if (args.length != 8) {
            System.out.println("Krivi broj argumenata!");
        } else if (args[0].length() != 3) {
            System.out.println("Broj znamenaka za random broj mora biti 3!");
        } else {
            randBroj = Integer.parseInt(args[0]);

            randomGenerator.setSeed(randBroj);
            brojTema = randomGenerator.nextInt(maxBrTema)+1;//generira se broj tema od max 10
            if (kategorijeNatjecatelj <= 3) {
                brojKategorija = randomGenerator.nextInt(3) + 1; // generira se broj kat od max 3
                brojNatjecatelja = randomGenerator.nextInt(brojMaxNatjecatelja); // generira se maximalni broj natjecatelja po 1 natjecanju

                NatjecanjeSingleton pokreni = NatjecanjeSingleton.getInstance();
                pokreni.Natjecanje(brojTema, brojKategorija, brojNatjecatelja);
            } else {
                System.out.println("Nemože biti vise od 3 kategorije na natjecanju");
            }

        }

    }



}
