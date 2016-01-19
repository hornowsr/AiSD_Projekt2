/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisd_projekt2;

import Struktury.BazaMiast;
import static Struktury.BazaMiast.drukujBaze;
import Struktury.Miasto;
import java.util.Random;

/**
 *
 * @author Rafał
 */
public class Losowanie {
    
    public static void Losowanie (BazaMiast baza){
        
        int x;
        Random random = new Random();
        x = baza.getN();
             
        String[] nazwy = {"Warszawa", "Poznań", "Kielce", "Harachwosty", "Mrozy", "Siedlce", "Katowice", "Gdynia",
                "Łosice", "Kraków", "", "", "", "", "", "", "", "", "", ""};
        
        for(int i = 0 ; i < x ; i++){
            
            int postuj = random.nextInt(10);
           // int ilePolaczen = random.nextInt(x-4)+4;
           // System.out.println("postuj"+postuj);
            int czyPolaczenie;
            int s,v;
            Miasto miasto = new Miasto(nazwy[i] ,postuj ,x  );
            //System.out.println("I"+i);
            for(int j = 0 ; j < x ; j++){
                //System.out.println("JJ"+j);
                s = random.nextInt(100)+1;
                v = random.nextInt(100)+1;
                czyPolaczenie = random.nextInt(2);
                //System.out.println("czyPolaczenie"+czyPolaczenie);
                if(czyPolaczenie==1){
                    miasto.dodajPolaczenie(j, s, v);
                }else{
                    miasto.dodajPolaczenie(j, 0, 0);
                }
            }
            
            baza.setMiasto(i, miasto);
           
        }
        
        
        drukujBaze(baza);
        
        
    }
    
    
}
