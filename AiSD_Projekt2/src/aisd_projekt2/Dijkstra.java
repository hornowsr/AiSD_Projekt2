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

        Miasto pom;
        pom = baza.getMiasto(0);
        baza.getMiasta()[0] = baza.getMiasta()[poczatek];
        baza.getMiasta()[poczatek] = pom;
        int wielkosc = baza.getN();
        int preD[] = new int[wielkosc];
        double matrix[][] = new double[wielkosc][wielkosc];
        double czas[] = new double[wielkosc];
        int odwiedzone[] = new int[wielkosc];
        double min;
        int NastepneMiasto = 0;
        double time;

        //Przygotowanie tablicy
        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc; j++) {
                if (baza.getMiasto(i).getPolaczenia()[j].getDroga() != 0 || baza.getMiasto(i).getPolaczenia()[j].getPredkosc() != 0) {
                                            
                        time = baza.getMiasto(i).getPolaczenia()[j].getDroga() / baza.getMiasto(i).getPolaczenia()[j].getPredkosc()
                                + baza.getMiasto(j).getPostoj();
                   
                    matrix[i][j] = time;

                } else {

                    matrix[i][j] = 0;
                }

                if (matrix[i][j] == 0) {

                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        czas = matrix[0];
        czas[0] = 0;
        odwiedzone[0] = 1;

        //Algorytm 
        for (int i = 0; i < wielkosc; i++) {

            min = Integer.MAX_VALUE;
            //Wyszukiwanie najmniejszej wartości
            for (int j = 0; j < wielkosc; j++) {

                if (min > czas[j] && odwiedzone[j] != 1) {

                    min = czas[j];
                    NastepneMiasto = j;
                }
            }

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
        }

        return preD;

    }

    public void Czas(int[] preD, BazaMiast baza) {

        for (int i = 0; i < preD.length; i++) {

            int j;
            System.out.println("Droga = " + baza.getMiasto(i).getNazwa());

            j = i;

            do {
                j = preD[j];
                System.out.println(" <- " + baza.getMiasto(j).getNazwa());

            } while (j != 0);

            //System.out.println();
        }

    }
}
