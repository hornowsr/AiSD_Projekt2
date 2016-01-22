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
    
    public Miasto[] getMiasta(){
        return listaMiast;
    }

    public void setMiasto(int i, Miasto nowe) {
        listaMiast[i] = nowe;
    }

    public void wyczysc() {
        n = 0;
        listaMiast = null;
    }

    public void inicjuj(int value) {
        this.n = value;
        listaMiast = new Miasto[n];
    }

    public static void drukujBaze(BazaMiast baza) {
        for (int i = 0; i < baza.getN(); i++) {
            System.out.println("Miasto:" + baza.getMiasto(i).getNazwa()+" Postuj="+baza.getMiasto(i).getPostoj() + System.getProperty("line.separator") + "     Połączenia:");
            for (int j = 0; j < baza.getN(); j++) {

                if (baza.getMiasto(i).getPolaczenia()[j].getDroga() != 0 && baza.getMiasto(i).getPolaczenia()[j].getPredkosc() != 0) {
                    double czas = baza.getMiasto(i).getPolaczenia()[j].getDroga() / baza.getMiasto(i).getPolaczenia()[j].getPredkosc();
                    System.out.println("           " + baza.getMiasto(j).getNazwa() +" Droga:"+baza.getMiasto(i).getPolaczenia()[j].getDroga()+
                            " Predkosc:"+ baza.getMiasto(i).getPolaczenia()[j].getPredkosc() + " Czas = " + czas);
                }
            }
        }
    }
}
