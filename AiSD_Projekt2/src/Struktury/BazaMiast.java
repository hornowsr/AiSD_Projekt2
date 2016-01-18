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
    private int n = 0;
    // private Polaczenie[] listaPolaczen;

    public BazaMiast() {
    }

    public int getN() {
        return n;
    }

    public Miasto getMiasto(int i) {
        return listaMiast[i];
    }

    public void dodajMiasto(int i, String nazwa, int postoj) {
        listaMiast[i] = new Miasto(nazwa, postoj);
    }

    public void wyczysc() {
        n = 0;
        listaMiast = null;
    }

    public void inicjuj(int value) {
        this.n = value;
        listaMiast = new Miasto[n];
    }
}
