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
    private int n;
   // private Polaczenie[] listaPolaczen;
    
    public BazaMiast(int n){
        listaMiast = new Miasto[n];
        this.n=n;
    }
    public int liczbaMiast() {
        return n;
    }
    
    public Miasto[] MiastaW(){
        return this.listaMiast;
    }
}
