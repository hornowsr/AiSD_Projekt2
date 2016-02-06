/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisd_projekt2;

import Struktury.BazaMiast;
import Struktury.Miasto;

/**
 *
 * @author Rafał
 */
public class Dijkstra {

    public int[] Dijktra(BazaMiast baza, int poczatek) {

     
        int wielkosc = baza.getN();
        int preD[] = new int[wielkosc];
        double matrix[][] = new double[wielkosc][wielkosc];
        double czas[] = new double[wielkosc];
        int odwiedzone[] = new int[wielkosc];
        double min;
        int NastepneMiasto = poczatek;
        preD[poczatek]=-1;
        double time;

        //Przygotowanie tablicy
        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc; j++) {
                if (baza.getMiasto(i).getPolaczenia()[j].getDroga() != 0 || baza.getMiasto(i).getPolaczenia()[j].getPredkosc() != 0) {

                    time = baza.getMiasto(i).getPolaczenia()[j].getDroga() / baza.getMiasto(i).getPolaczenia()[j].getPredkosc()
                            + baza.getMiasto(j).getPostoj();

                    matrix[i][j] = time;

                } else {

                    //matrix[i][j] = 0;
                    matrix[i][j] = 99;
                }
                matrix[i][i]=0;
            }
            odwiedzone[i]=-1;
        }
      //  for(int i = 0 ; i < wielkosc ; i++){
       //     for(int j=0 ; j < wielkosc ; j++){
       //         System.out.print("   "+matrix[i][j]);
       //     }
       //         System.out.println();
       //     }

        czas = matrix[poczatek];
        czas[poczatek] = 0;
        odwiedzone[poczatek] = 1;

        int pom=NastepneMiasto;
        //Algorytm 
        for (int i = 0; i < wielkosc-1; i++) {
            
            min = Integer.MAX_VALUE;
            //Wyszukiwanie najmniejszej wartości
            for (int j = 0; j < wielkosc; j++) {

                if (odwiedzone[j] != 1&&min > czas[j] ) {

                    min = czas[j];
                    NastepneMiasto = j;
                    
                    
                }
            }
            
            
            preD[NastepneMiasto]=pom;
            odwiedzone[NastepneMiasto] = 1;
            //Właściwy algorytm Dijkstry
            for (int k = 0; k < wielkosc; k++) {

                if (odwiedzone[k] != 1) {

                    if (min + matrix[NastepneMiasto][k] < czas[k]) {

                        czas[k] = min + matrix[NastepneMiasto][k];
                        preD[k] = NastepneMiasto;
                    }

                }

            }
            pom=NastepneMiasto;
        }
     //  for(int i = 0 ; i < wielkosc ; i++)
      //     System.out.println("PRED: "+i+":"+preD[i]);
        
        return preD;

    }

    public void Czas(int[] preD, BazaMiast baza) {

        for (int i = 0; i < preD.length; i++) {

            int j;
            System.out.println("Droga = " + baza.getMiasto(i).getNazwa());

            j = i;

            while (j != -1) {
                j = preD[j];
                System.out.println(" <- " + baza.getMiasto(j).getNazwa());

            } 

            //System.out.println();
        }

    }
}
