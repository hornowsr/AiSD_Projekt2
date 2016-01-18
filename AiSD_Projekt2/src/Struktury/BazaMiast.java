/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Struktury;

/**
 *
 * @author kuzniarg
 */
public class BazaMiast {

    private Miasto[] listaMiast;
    private int max = 0, aktualnie = 0;
    // private Polaczenie[] listaPolaczen;

    public BazaMiast() {
        max = 4;
        listaMiast = new Miasto[max];
    }

    public int liczbaMiast() {
        return aktualnie;
    }
    
    public Miasto getMiasto (int i){
        return listaMiast[i];
    }

    public void dodajMiasto(String nazwa, int postoj) {
        if (aktualnie == max) {
            max *= 2;
            Miasto[] pom = new Miasto[max];
            for (int i = 0; i < max / 2; i++) {
                pom[i] = listaMiast[i];
            }
            listaMiast = pom;
        }
        Miasto nowe = new Miasto(nazwa, postoj);
        listaMiast[aktualnie] = nowe;
        aktualnie++;
    }
}
